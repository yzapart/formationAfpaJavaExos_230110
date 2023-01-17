package afpa_java_230110;

import java.util.Scanner;

public class Exo33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entrer le paramètre :");
		String chaine = scan.nextLine();
		
		int somme_ascii = 0;
		for (int i = 0; i < chaine.length(); i++) {
			System.out.println(chaine.charAt(i) + "\tascii : " + (int)chaine.charAt(i) );
			somme_ascii += (int)chaine.charAt(i);
		}
		
		System.out.println("Somme des codes ascii : " + somme_ascii);
		scan.close();
	}
}
