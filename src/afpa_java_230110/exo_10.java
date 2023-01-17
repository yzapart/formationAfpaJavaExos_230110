package afpa_java_230110;

import java.util.Scanner;

public class exo_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tab[];
		tab = new int[10];
		int somme = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Entrer nombre (" + (i + 1) + "/10) :");
			int nombre = scan.nextInt();
			tab[i] = nombre;
			somme += nombre;
		}

		System.out.println("Somme du tableau : " + somme);
		
		// exo 11:
		int min = tab[0];
		int max = tab[0];
		float moy = 0;
		
		for (int nombre : tab) {
			if (nombre < min) {
				min = nombre;
			}
			if (nombre > max) {
				max = nombre;
			}
			moy += nombre;
		}
		moy = moy / 10;
		
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
		System.out.println("Moyenne : " + moy);

		
		// exo 12
		System.out.println("Entrer valeur à rechercher :");
		int val = scan.nextInt();
		for (int i=0; i<10; i++) {
			if (tab[i] == val) {
				System.out.println("La valeur '" + val + "' est présente en position " + (i+1));
			}
		}
		
		
		scan.close();
	}
}
