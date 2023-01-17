package afpa_java_230110;

import java.util.Scanner;

public class exo_23 {
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
		int[][] a1 = {  { 1, 2, 3 }, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 } };

		int[][] a2 = {  { 1, 2, 3 }, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 } };

		// affichage a1 et a2
		System.out.println("a1 =");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("a2 =");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a2[i][j] + "\t");
			}
			System.out.println();
		}

		// multiplication
		int[][] am = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				am[i][j] = 0;
				for (int k = 0; k < n; k++) {
					am[i][j] += a1[i][k] * a2[k][j];
				}
			}
		}

		// affichage a1*a2
		System.out.println();
		System.out.println("a1 * a2 =");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(am[i][j] + "\t");
			}
			System.out.println();
		}

		scan.close();
	}
}
