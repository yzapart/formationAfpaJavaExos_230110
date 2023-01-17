package afpa_java_230110;

import java.util.Scanner;

public class exo_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nombre de départ : ");
		int n = scan.nextInt();

		int somme_n = 0;
		
		for (int i = 1; i<=n; i++) {
			somme_n += i;
		}

		System.out.println("Somme des entiers : " + somme_n);
		scan.close();
	}
}
