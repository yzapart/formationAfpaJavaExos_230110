package afpa_java_230110;
import java.util.Scanner;

public class Exo35 {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrer la chaine à encoder :");
		String chaine = scan.nextLine();

		System.out.println("Entrer le décalage :");
		int decalage = scan.nextInt();
		
		String chaineCryptee = "";
		
		for (int i=0; i<chaine.length(); i++) {
			char charAencoder     = chaine.charAt(i);
			char charEncode;
			if (charAencoder == ' ') {
				charEncode = ' ';
			} else {
				int indexCharAencoder = alphabet.indexOf(charAencoder);
				charEncode       = alphabet.charAt((indexCharAencoder + decalage) % alphabet.length());				
			}
			chaineCryptee        += charEncode;
			
			
		}
		
		System.out.println(chaineCryptee);
		scan.close();
	}
	
	
}
