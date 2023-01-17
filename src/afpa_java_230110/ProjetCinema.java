package afpa_java_230110;

import java.util.Scanner;

public class ProjetCinema {

	// { n° salle, nb de spectateurs, capacite max, nb de transactions }
	static int liste_salles[][] = { 
									{ 1, 8, 10, 3 }, 
									{ 2, 15, 15, 9 }, 
									{ 3, 0, 5, 0 } 
								  };

	// { id, titre, n° salle, prix }
	static String liste_films[][] = { 
										{ "1", "Les sept samouraïs", "1", "7" }, 
										{ "2", "8 1/2           ", "2", "5" },
										{ "3", "Nostalgia        ", "3", "10" } 
									};

	// string { article, prix }
	static String liste_snacks[][] = {
			{"Pop-corn 100g       ", "5"},
			{"Soda 33cl           ", "3"},
			{"Bonbons 100g        ", "4"},
			{"Patates à l'ail     ", "1"},
			{"Couscous maison     ", "10"}
	};
	
	
	static int N_HISTO = 10;
	// { film, salle, nb_places, montant }
	// { article,
	static String historique[][] = new String[500][4];
	static int nbTransactions = 0;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println("-------- Menu ----------------------");
		System.out.println("1 : Encaissement film");
		System.out.println("2 : Encaissement snack");
		System.out.println("3 : Gestion des salles");
		System.out.println("4 : Historique transactions");
		System.out.println("5 : Quitter");
		System.out.println("------------------------------------");
		System.out.print("Choix : ");
		int choixMenu = scan.nextInt();
		switch (choixMenu) {
		case 1:
			menuChoixFilm();
			break;
		case 2:
			menuSnack();
			break;
		case 3:
			gestionSalle();
			break;
		case 4:
			afficherHistorique();
			break;
		case 5:
			quitter();
			break;
		}
	}

	public static void menuSnack() {
		System.out.println("--------------- Snacks -----------------");
		for (int i = 0; i < liste_snacks.length; i++) {
			System.out.println((i+1) + ": " + liste_snacks[i][0] + "\t: " + liste_snacks[i][1] + " €");
		}
		System.out.println("----------------------------------------");
		System.out.println("\nEntrer choix client : ");
		int choixClient = scan.nextInt() - 1;
		
		System.out.println("\nNombre d'article(s) : ");
		int nbArticles = scan.nextInt();
		
		encaissement(Double.parseDouble(liste_snacks[choixClient][1])*nbArticles);
		
		int indexHistorique = nbTransactions;
		// titre du film
		// article
		historique[indexHistorique][0] = liste_snacks[choixClient][0];
		// salle
		// -
		historique[indexHistorique][1] = "              ";
		// nb de places
		// nb d'articles
		historique[indexHistorique][2] = Integer.toString(nbArticles) + " article(s)";
		// Montant encaissé
		// Montant encaissé
		historique[indexHistorique][3] = Double.toString(Double.parseDouble(liste_snacks[choixClient][1])*nbArticles) + " €";
		
		nbTransactions += 1;

		menu();
	}
	
	
	public static void menuChoixFilm() {
		afficherFilms(liste_films);
		System.out.println("\nEntrer choix client : ");
		int choixClient = scan.nextInt() - 1;
		
		System.out.println("\nNombre de place(s) : ");
		int nbPlaces = scan.nextInt();
		
		if (salleEstPleine(choixClient + 1, nbPlaces)) {
			System.out.println("Impossible, pas assez de places disponibles en salle n°" + liste_salles[choixClient][0]+".");
		} else {
			encaissement(Double.parseDouble(liste_films[choixClient][3])*nbPlaces);
			System.out.println("Le film '" + liste_films[choixClient][1] + "' est projeté en salle n°"
					+ liste_films[choixClient][2]);
			liste_salles[choixClient][1] += nbPlaces;
			liste_salles[choixClient][3] += 1;
			
			
			// --- inscription historique transactions ---
			int indexHistorique = nbTransactions;
			// titre du film
			historique[indexHistorique][0] = liste_films[choixClient][1];
			// salle
			historique[indexHistorique][1] = "Salle n°" + liste_films[choixClient][2];
			// nb de places
			historique[indexHistorique][2] = Integer.toString(nbPlaces) + " place(s)";
			// Montant encaissé
			historique[indexHistorique][3] = Double.toString(Double.parseDouble(liste_films[choixClient][3])*nbPlaces) + " €";			
			nbTransactions += 1;
		}
		menu();
	}


	public static void afficherHistorique() {
		System.out.println("----------------- Historique transactions --------------------------");
		for (int i = N_HISTO-1; i >= 0; i--) {
			if (historique[i][0] != null) {				
				System.out.print(historique[i][0] + "\t");
				System.out.print(historique[i][1] + "\t");
				System.out.print(historique[i][2] + "\t");
				System.out.print(historique[i][3] + "\t");
				System.out.println();
			}
		}
		System.out.println("--------------------------------------------------------------------");
		menu();
	}

	public static void afficherFilms(String[][] liste) {
		System.out.println("-----------------------");
		for (int i = 0; i < liste.length; i++) {
			System.out.println(liste[i][0] + " : " + liste[i][1]);
		}
	}

	public static void encaissement(double prix) {
		double reste = prix;
		do {
			System.out.println("Reste à encaisser : " + reste + " €");
			System.out.println("Encaissement : ");
			reste -= Math.round(scan.nextDouble() * 100.0) / 100.0;
		} while (reste != 0);
		System.out.println("Encaissement terminé.");
	}

	public static boolean salleEstPleine(int nSalle, int nbPlaces) {
		boolean res = false;
		if (liste_salles[nSalle - 1][1] + nbPlaces > liste_salles[nSalle - 1][2]) {
			res = true;
		}
		return res;
	}

	public static void gestionSalle() {
		System.out.println("----------------------");
		for (int i = 0; i < liste_salles.length; i++) {
			System.out
					.println("Salle n°" + liste_salles[i][0] + " : " + liste_salles[i][1] + " place(s) / " + liste_salles[i][2] + "\t -  " + liste_salles[i][3] + " transaction(s)");
		}
		System.out.println("----------------------");
		System.out.print("Entrer le n° de la salle à vider (0: retour menu / 99: tout vider) : ");
		int nSalle = scan.nextInt();
		if (nSalle != 0 && nSalle != 99) {
			liste_salles[nSalle - 1][1] = 0;
		} else if (nSalle == 99) {
			for (int i = 0; i < liste_salles.length; i++) {
				liste_salles[i][1] = 0;
			}
		}
		menu();
	}
	
	public static int nombreTransactionsSalle(int nSalle) {
		int res = 0;
		for (int i=0; i<historique.length; i++) {
			if (historique[i][1] == ("Salle n°" + nSalle)) {
				res += 1;
			}
		}
		return res;
	}

	public static void quitter() {
		System.out.println("Au revoir.");
		System.exit(0);
	}
}