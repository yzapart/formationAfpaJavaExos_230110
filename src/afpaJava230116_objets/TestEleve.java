package afpaJava230116_objets;

import afpa_java_230110.exo_02;

public class TestEleve {

	public static void main(String[] args) {
		
		Eleve e1 = new Eleve("Roméo");
		e1.ajouterNote(6);
		e1.ajouterNote(15);
		e1.ajouterNote(22);
		e1.ajouterNote(2);

		Eleve e2 = new Eleve("Alice");
		e2.ajouterNote(14);
		e2.ajouterNote(5);
		e2.ajouterNote(20);
		e2.ajouterNote(2);
	
		Eleve e3 = new Eleve("Mouloud");
		e3.ajouterNote(18);
		e3.ajouterNote(15);
		e3.ajouterNote(50);
		e3.ajouterNote(4);
		
		
		Eleve[] t;
		t = new Eleve[5];
		
		t[0] = e1;
		t[1] = e2;
		t[2] = e3;
		
		for (Eleve e: t) {
			if (e != null) {
				e.afficherProfil(); 
				System.out.println("---");
			}
		}
		
		System.out.println("recherche :");
		recherche("Mouloud", t).afficherProfil();
		
		System.out.println("---");
		System.out.println("---");
		System.out.println("---     ajout élève allo    ---");		
		ajoutEleve("allo", t);
		
		for (Eleve e: t) {
			if (e != null) {
				e.afficherProfil(); 
				System.out.println("---");
			}
		}
		

		System.out.println("---");
		System.out.println("---      modif élève allo --> bobo     ---");		
		recherche("allo", t).modifierNom("bobo");
		
		// affichage tableau
		for (Eleve e: t) {
			if (e != null) {
				e.afficherProfil(); 
				System.out.println("---");
			}
		}
		
		System.out.println("---");
		System.out.println("---      supp élève bobo     ---");		
		suppEleve("bobo", t);
		// affichage tableau
		for (Eleve e: t) {
			if (e != null) {
				e.afficherProfil(); 
				System.out.println("---");
			}
		}
		
		
		System.out.println("---");
		System.out.println("---      moyenne groupe     ---");
		System.out.println(moyenneGroupe(t));
		
		
		System.out.println("---");
		System.out.println("---      note mini     ---");
		System.out.println(noteMinimale(t));
		
		System.out.println("---");
		System.out.println("---      note maxi     ---");
		System.out.println(noteMaximale(t));
		
		
		
		
	}
	

	static Eleve recherche(String nom, Eleve t[]) {
		for (Eleve e: t) {
			if (e != null && e.getNom() == nom) {
				return e;
			}
		}
		return null;
	}
	
	static void ajoutEleve(String nom, Eleve t[]) {
		int index = 0;
		while (t[index] != null) index += 1;
		t[index] = new Eleve(nom);
	}
	
	static void modifEleve(String nom, String newNom, Eleve t[]) {
		for (Eleve e: t) {
			if (e.getNom() == nom) {
				e.modifierNom(newNom);
			}
		}
	}
	
	static void suppEleve(String nom, Eleve t[]) {
		int index =  0;
		while (t[index].getNom() != nom) index += 1;
		while (t[index + 1] != null) {
			t[index] = t[index + 1];
			index += 1;
		}
		t[index] = null;
	}
	
	static double moyenneGroupe(Eleve t[]) {
		double moy = 0;
		int nbEleves = 0;
		for (Eleve e: t) {
			if (e != null) {
				if (Double.isNaN(e.getMoyenne()) == false) {
					moy += e.getMoyenne();
					nbEleves += 1;
				}
			}
		}
		return moy / nbEleves;
	}
	
	static int noteMinimale(Eleve t[]) {
		int noteMini = t[0].getNotes()[0];
		for (Eleve e: t) {
			if (e != null) {
				for (int i=0; i < e.getNbNotes(); i++) {
					if (e.getNotes()[i] < noteMini) noteMini = e.getNotes()[i];					
				}
			}
		}
		return noteMini;
	}
	
	static int noteMaximale(Eleve t[]) {
		int noteMaxi = t[0].getNotes()[0];
		for (Eleve e: t) {
			if (e != null) {
				for (int i=0; i < e.getNbNotes(); i++) {
					if (e.getNotes()[i] > noteMaxi) noteMaxi = e.getNotes()[i];					
				}
			}
		}
		return noteMaxi;
	}
	

	
}
