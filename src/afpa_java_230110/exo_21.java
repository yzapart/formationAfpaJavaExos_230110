package afpa_java_230110;

import java.util.Scanner;

public class exo_21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		System.out.println("Dimension n : ");
//		int n = scan.nextInt();
//
//		// déclaration matrice a
//		int[][] a = new int[n][n];
//
//		// remplissage
//		for (int i=0; i<n; i++) {
//			for (int j=0; j<n; j++) {
//				System.out.print(String.format("Entrer a[%d][%d] : ", i, j));
//				a[i][j] = scan.nextInt();
//			}
//		}

		int n = 3;
		int[][] a = { { 23,  0,  0 }, 
					  {  0, 34,  0 }, 
					  {  0,  0, 90 } };

		// affichage
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		boolean estTriSup = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ( i > 0 && j < i && a[i][j] != 0) {
					estTriSup = false;
				}
			}
		}
		System.out.println("Matrice triangulaire supérieure : " + estTriSup);

		// exo 22
		boolean estTriInf = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ( j > 0 && i < j && a[i][j] != 0) {
					estTriInf = false;
				}
			}
		}
		System.out.println("Matrice triangulaire inférieure : " + estTriInf);
		
		
		
		scan.close();
	}
}
