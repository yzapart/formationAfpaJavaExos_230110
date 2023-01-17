package afpa_java_230110;
import java.util.Scanner; 


public class exo_03 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Saisir prénom :");
		String s = scan.nextLine();
		System.out.printf("Bonjour " + s + " !");
		scan.close();
	}
	
}

