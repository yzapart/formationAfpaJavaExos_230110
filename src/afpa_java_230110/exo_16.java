package afpa_java_230110;

import java.util.Scanner;

public class exo_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nombre de départ : ");
		int n = scan.nextInt();

		for (int i = n + 1; i <= n + 10; i++) {
			System.out.print((i) + " ");
		}

		scan.close();
	}
}
