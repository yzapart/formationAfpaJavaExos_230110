package afpa_java_230110;

import java.util.Scanner;

public class Exo29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String mdpRight = "Password";
		int nbTentatives = 0;
		boolean acces = false;

		while (nbTentatives <3 && acces == false) {
			System.out.println("Entrer mot de passe :");
			String mdpInput = scan.nextLine();
			nbTentatives += 1;
			if (mdpInput.equals(mdpRight)) {
				System.out.println("Accès autorisé");
				acces = true;
			} else {
				System.out.println("Mot de passe incorrect");
			}
		}
		
		if (nbTentatives == 3) {
			System.out.println("3 tentatives échouées. Question secrète ? (Y/n)");
			if (scan.nextLine().equals("Y")) {
				System.out.println("Que désire Gros-Minet ?");
				if (scan.nextLine().equals("Titi")) {
					System.out.println("Accès autorisé");
					acces = true;
				} else {
					System.out.println("Compte bloqué");
				}
			} else {
				System.out.println("Authentification abandonée");
			}
		}
		
		
		

		scan.close();
	}
}
