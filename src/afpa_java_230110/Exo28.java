package afpa_java_230110;

import java.text.DecimalFormat;

public class Exo28 {

	private static final DecimalFormat df = new DecimalFormat("0");

	public static void main(String[] args) {
		double popAlpha = 10e6;
		double popBeta = 5e6;
		
		System.out.println("Année\tAlpha\t\tBeta");
		System.out.println("0\t" + df.format(popAlpha) + "\t" + df.format(popBeta));
		
		int i = 0;
		while (popBeta < popAlpha) {
			i += 1;
			popAlpha += 500000;
			popBeta  *= 1.03;
			System.out.println(i + "\t" + df.format(popAlpha) + "\t" + df.format(popBeta));
		}

		System.out.println("\nLes Beta dépasseront les Alpha dans " + i + " années.");
	}
}
