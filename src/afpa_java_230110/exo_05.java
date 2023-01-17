package afpa_java_230110;

import java.util.Scanner;

public class exo_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String semaine[] = { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" };
		System.out.println(semaine[scan.nextInt() - 1]);
		scan.close();
	}
}
