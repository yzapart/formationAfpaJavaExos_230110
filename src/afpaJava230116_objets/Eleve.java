package afpaJava230116_objets;

public class Eleve {

	private String nom;
	private int[] listeNotes = new int[10];
	private int nbNotes = 0;
	private double moyenne;
	
	public Eleve(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int[] getNotes() {
		return this.listeNotes;
	}
	
	public int getNbNotes() {
		return this.nbNotes;
	}
	
	public void ajouterNote(int note) {
		if (note < 0)  note = 0;
		if (note > 20) note = 20;
		this.listeNotes[nbNotes] = note;
		nbNotes += 1;
		moyenne = getMoyenne();
		}
	
	public String strListeNotes() {
		String r = "";
		for (int i =0; i<nbNotes; i++) {
			r += listeNotes[i] + "   ";
		}
		return r;
	}
	
	public double getMoyenne() {
		double moy = 0;
		for (int n: listeNotes) {
			moy += n;
		}
		return moy/nbNotes;
	}
	
	public void afficherProfil() {
		System.out.println("Nom     : " + this.getNom());
		System.out.println("Notes   : " + this.strListeNotes());
		System.out.println("Moyenne : " + this.getMoyenne());
	}
	
	public void modifierNom(String newNom) {
		this.nom = newNom;
	}
}
