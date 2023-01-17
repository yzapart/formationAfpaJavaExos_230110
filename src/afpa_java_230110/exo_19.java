package afpa_java_230110;

import java.util.Scanner;

public class exo_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dimension n : ");
		int n = scan.nextInt();

		// déclaration matrice a
		int[][] a = new int[n][n];

		// remplissage
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(String.format("Entrer a[%d][%d] : ", i, j));
				a[i][j] = scan.nextInt();
			}
		}

		// affichage
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		// exo 20
		boolean estDiagonale = true;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (i != j && a[i][j] != 0) {
					estDiagonale = false;
				}
			}
		}
		System.out.println("Matrice diagonale : " + estDiagonale);
		
		scan.close();
	}
}
