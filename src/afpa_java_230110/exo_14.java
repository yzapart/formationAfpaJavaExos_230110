package afpa_java_230110;

import java.util.Scanner;

public class exo_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean correctInput = false;
		while (!correctInput) {
			System.out.println("Entrez un nombre entre 1 et 3 :");
			int n = scan.nextInt();
			if (n >= 1 && n <=3) {
				correctInput = true;
				System.out.println("Ok");
			}
		}
		
		scan.close();
	}
}
