package afpa_java_230110;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exo25 {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Prix de base : ");
		double prixBase = scan.nextDouble();
		
		System.out.println("Age du passager : ");
		int age = scan.nextInt();
		
		double coef;
		if (age < 2) {
			coef = 0;
		} else if (age < 10) {
			coef = 0.5;
		} else if (age < 27 || age > 70) {
			coef = 0.9;
		} else {
			coef = 1;
		}
		
		System.out.printf("Prix du billet : " + df.format(prixBase*coef) + " €");
//		System.out.println(coef*prixBase);
		
		scan.close();
	}
}
