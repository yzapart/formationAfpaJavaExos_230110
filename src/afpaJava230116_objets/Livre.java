package afpaJava230116_objets;

public class Livre {
	
	private String id, titre, auteur;
	private int prix;
	
	public String getId() 		{return this.id;}
	public String getTitre() 	{return this.titre;}
	public String getAuteur() 	{return this.auteur;}
	public int    getPrix() 	{return this.prix;}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public Livre() {
	}
	
	public Livre(String id, String titre, String auteur, int prix) {
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	
	public void afficher() {
		System.out.println(id + " - " + titre + " - " + auteur + " - " + prix);
	}
	
}
