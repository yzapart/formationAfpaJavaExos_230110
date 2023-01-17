package afpa_java_230110;

import java.util.Scanner;

public class exo_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entrer un nombre :");
		int n = scan.nextInt();

		int somme_impairs = 0;
		int somme_pairs = 0;
		for (int i = 0; i < n; i++) {
			if ((i % 2) == 0) {
				somme_pairs += i;
			} else {
				somme_impairs += i;
			}
		}

		System.out.println("Somme pairs : " + somme_pairs);
		System.out.println("Somme impairs : " + somme_impairs);

		scan.close();
	}
}
