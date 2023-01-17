package afpa_java_230110;

import java.util.Scanner;

public class exo_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nombre de départ : ");
		int n = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (i*n));
		}

		scan.close();
	}
}
