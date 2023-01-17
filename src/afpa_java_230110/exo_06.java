package afpa_java_230110;

import java.util.Scanner;

public class exo_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tab[];
		tab = new int[100];
		int i = 0;
		System.out.println("Entrer un nombre :");
		int n = scan.nextInt();
		while (n != 0) {
			tab[i] = n;
			n = scan.nextInt();
			i += 1;
		}

		// minimum :
		int min = tab[0];
		for (int nombre : tab) {
			if (nombre > 0 && min > nombre) {
				min = nombre;
			}
		}
		System.out.println("Minimum : " + min);

		// somme :
		int somme = 0;
		for (int nombre : tab) {
			somme += nombre;
		}
		System.out.println("Somme : " + somme);

		scan.close();
	}
}
