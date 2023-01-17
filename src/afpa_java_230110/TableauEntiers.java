package afpa_java_230110;

import java.util.Scanner;

public class TableauEntiers {

	public static void afficher(int[] t) {
		System.out.println();
		for (int element : t) {
			System.out.print(element + "\t");
		}
		System.out.println();
	}

	public static void remplir(int[] t) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < t.length; i++) {
			System.out.print("Entrer la valeur n°" + i + " :");
			System.out.println();
			t[i] = scan.nextInt();
		}
		scan.close();
	}

	public static int somme(int[] t) {
		int somme = 0;
		for (int element : t) {
			somme += element;
		}
		return somme;
	}

	public static int minimum(int[] t) {
		int min = t[0];
		for (int element : t) {
			if (element < min) {
				min = element;
			}
		}
		return min;

	}

	public static int indiceMaxi(int[] t) {
		int max = t[0];
		int iMax = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i];
				iMax = i;
			}
		}
		return iMax;
	}

	public static int[] opposes(int[] t) {
		int[] tOpp = new int[t.length];
		for (int i = 0; i < t.length; i++) {
			tOpp[t.length - 1 - i] = t[i];
		}
		return tOpp;
	}

	public static void main(String[] args) {
		int[] t = new int[5];
		remplir(t);
		afficher(t);
		System.out.println("Somme : " + somme(t));
		System.out.println("Minimum : " + minimum(t));
		System.out.println("Indice maxi : " + indiceMaxi(t));
		System.out.print("Tableau opposé :");
		afficher(opposes(t));
	}
}
