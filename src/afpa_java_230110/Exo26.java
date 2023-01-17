package afpa_java_230110;

import java.util.Scanner;

public class Exo26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Entrer âge : ");
		int age = scan.nextInt();

		int somme = 0;
		int i = 0;
		while (i <= age) {
			somme += (100 + i * 2);
			i += 1;
		}

		System.out.println("Age : " + age + "\t Somme : " + somme);
		scan.close();
	}
}
