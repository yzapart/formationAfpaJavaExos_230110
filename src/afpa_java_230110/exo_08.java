package afpa_java_230110;

import java.util.Scanner;

public class exo_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entrer la quantité de nombre :");
		int n = scan.nextInt();
		int tab[];
		tab = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Entrer un nombre ( " + (i+1) + "/" + n +" ) :");
			tab[i] = scan.nextInt();
		}
		
		// recherche du maximum
		int max = 0;
		for (int nombre : tab) {
			if (nombre > max) {
				max = nombre;
			}
		}
		
		System.out.println("Maximum : " + max);
		scan.close();
	}
}
