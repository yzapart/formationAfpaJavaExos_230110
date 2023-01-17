package afpa_java_230110;

import java.util.Scanner;

public class exo_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;

		System.out.print("Saisir le nombre a :");
		a = scan.nextInt();
		System.out.print("Saisir le nombre b :");
		b = scan.nextInt();
		System.out.printf("a = %d, b = %d\n", a, b);

		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.printf("Les valeurs sont maintenant inversées : \na = %d et b = %d", a, b);
		scan.close();
	}

}
