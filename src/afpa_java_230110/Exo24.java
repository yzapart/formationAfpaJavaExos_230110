package afpa_java_230110;

public class Exo24 {
	public static void main(String[] args) {
		int j1 = 15;
		int m1 = 6;
		int a1 = 2023;

		int j2 = 26;
		int m2 = 6;
		int a2 = 1986;

		String date1 = conversionIntToDateStr(j1, m1, a1);
		String date2 = conversionIntToDateStr(j2, m2, a2);

		System.out.println("Date 1 : " + date1);
		System.out.println("Date 2 : " + date2);

		System.out.println("Date 1 > Date 2 : " + String.valueOf(Integer.parseInt(date1) > Integer.parseInt(date2)));
		System.out.println("Date 1 < Date 2 : " + String.valueOf(Integer.parseInt(date1) < Integer.parseInt(date2)));
		System.out.println("Date 1 = Date 2 : " + String.valueOf(Integer.parseInt(date1) == Integer.parseInt(date2)));

	}

	static String conversionIntToDateStr(int j, int m, int a) {
		String jour;
		if (j < 10) {
			jour = "0" + String.valueOf(j);
		} else {
			jour = String.valueOf(j);
		}

		String mois;
		if (m < 10) {
			mois = "0" + String.valueOf(m);
		} else {
			mois = String.valueOf(m);
		}

		return (String.valueOf(a) + mois + jour);
	}
}
