package afpa_java_230110;

import java.util.Scanner;

public class exo_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nb = 5;
		int tab[];
		tab = new int[nb];
		for (int i = 0; i < nb; i++) {
			System.out.println("Entrer nombre (" + (i + 1) + "/" + nb + ") :");
			tab[i] = scan.nextInt();
		}

		int tab_neg[];
		tab_neg = new int[nb];
		int nb_neg = 0;

		int tab_pos[];
		tab_pos = new int[nb];
		int nb_pos = 0;

		for (int nombre : tab) {
			if (nombre >= 0) {
				tab_pos[nb_pos] = nombre;
				nb_pos += 1;
			} else {
				tab_neg[nb_neg] = nombre;
				nb_neg += 1;
			}
		}

		int tab_res[];
		tab_res = new int[nb];
		for (int i = 0; i < nb; i++) {
			if (i < nb_neg) {
				tab_res[i] = tab_neg[i];
			} else {
				tab_res[i] = tab_pos[(i - nb_neg)];
			}
		}

		for (int i = 0; i < tab_res.length; i++) {
			System.out.println(tab_res[i]);
		}
		scan.close();
	}
}
