package afpa_java_230110;

import java.util.Scanner;

public class Exo_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez l'âge :");
		int age = scan.nextInt();
		String r = "";
		
		if (age == 6 || age == 7) {
			r = "Poussin";
		} else if (age == 8 || age == 8) {
			r = "Pupille";
		} else if (age == 10 || age == 11) {
			r = "Minime";
		} else if (age >= 12) {
			r = "Cadet";
		} else {
			System.out.println("Erreur d'entrée");
		}
		
		System.out.println("Catégorie : " + r);
		
		scan.close();
	}
}
