package afpa_java_230110;
import java.util.Scanner; 


public class exo_02 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.print("Saisir le nombre a :");
		a = scan.nextInt();
		System.out.printf("a² = %d", a*a);
		scan.close();
	}
	
}

