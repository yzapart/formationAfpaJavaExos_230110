package afpa_java_230110;

public class Exo31 {

	public static boolean parfait(int n) {
		int somme = 0;
		boolean res = false;
		for (int i = 1; i < n; i++) {
			if ((n % i) == 0) {
				// cas i est un diviseur de n
				somme += i;
			}
			if (somme == n) {
				res = true;
			} else {
				res = false;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		for (int i=1; i<10000; i++) {
			if (parfait(i)) {
				System.out.println(i + " est parfait.");
			}
		}
	}

}
