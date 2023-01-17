package afpaJava230116_objets;

public class Rectangle {

	private double longueur, largeur;

	public double getLongueur() {
		return longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public Rectangle() {
	}

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double perimetre() {
		return 2 * (this.longueur + this.largeur);
	}

	public double aire() {
		return (this.longueur * this.largeur);
	}

	public boolean isCarre() {
		if (this.longueur == this.largeur) {
			return true;
		} else {
			return false;
		}
	}

	public void afficherString() {
		String estCarre = this.isCarre() ? "C'est un carré" : "Ce n'est pas un carré";
		System.out.println(
				"Longueur : " + this.longueur + " - " + 
				"Largeur : " + this.largeur + " - " + 
				"Périmètre : " + this.perimetre() + " - " + 
				"Aire : " + this.aire() + " - " + 
				estCarre
				);
	}

}
