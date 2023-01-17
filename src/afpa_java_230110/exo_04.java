package afpa_java_230110;
import java.util.Scanner; 
import java.text.DecimalFormat;

public class exo_04 {

	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Saisir prix HT de l'article :\n");
		float pht = scan.nextFloat();
		
		System.out.print("Saisir nombre d'articles :\n");
		float n = scan.nextFloat();		
		
		System.out.print("Saisir taux TVA (en %) :\n");
		float taux = scan.nextFloat();
		
		float totalTTC = n*pht*(1 + taux/100);
		System.out.printf("Prix total TTC : " + df.format(totalTTC) + " €");
		
		scan.close();
	}
}

