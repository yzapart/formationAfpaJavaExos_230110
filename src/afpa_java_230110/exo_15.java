package afpa_java_230110;

import java.util.Scanner;

public class exo_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean correctInput = false;
		while (!correctInput) {
			System.out.println("Entrez un nombre entre 10 et 20 :");
			int n = scan.nextInt();
			if (n >= 10 && n <= 20) {
				correctInput = true;
				System.out.println("Ok");
			} else if (n < 10) {
				System.out.println("Plus grand !");
			} else if (n > 20) {
				System.out.println("Plus petit !");
			}
		}

		scan.close();
	}
}
