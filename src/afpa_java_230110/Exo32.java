package afpa_java_230110;

import java.util.Scanner;

public class Exo32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entrer la chaine de caractères :");
		String chaine = scan.nextLine();

		System.out.println("Entrer le caractère à rechercher :");
		char c = scan.next().charAt(0);

		System.out.println("Le caractère '" + c + "' se trouve en position (index) " + chaine.indexOf(c));
		scan.close();
	}
}
