package afpa_java_230110;
import java.util.Scanner;

public class Exo34 {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer la chaine à encoder :");
		String chaine = scan.nextLine();
		
		String chaineCryptee = "";
		
		for (int i=0; i<chaine.length(); i++) {
			char charAencoder     = chaine.charAt(i);
			int indexCharAencoder = alphabet.indexOf(charAencoder);
			char charEncode       = alphabet.charAt((indexCharAencoder + 1) % alphabet.length());
			chaineCryptee        += charEncode;
		}
		
		System.out.println(chaineCryptee);
		scan.close();
	}
}
