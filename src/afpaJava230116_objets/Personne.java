package afpaJava230116_objets;

public class Personne {
	private String nom;
	private int age;
	
	
	public Personne() {
	}
	
	public Personne(String nom, int age) {
		this.nom = nom; 
		this.age = age;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void afficher() {
		if (this != null) {
			System.out.println(this.nom + " " + this.age);			
		}
	}
	
}
