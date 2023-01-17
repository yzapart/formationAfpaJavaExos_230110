package afpaJava230116_objets;

//une classe c'est un modèle qui décrit les caractèristiques d'un objet
//caract d'un objet : données : attributs
//pour créer un objet on a besoin d'un constructeur
//pour accéder aux valeurs des attributs : getter
//pour modifier la valeur d'un attribut : setter


public class Voiture {

	//données : caractèristiques d'une voitures : attributs de la classe
	private String marque;
	private String couleur;
	private int poids;
  
  
  
  
  
  
  
  
  
	  //constructeur : créer un objet de type voiture
	  //initialiser les attributs de l'objet
	  //doit porter le même nom de la classe
	  //doit etre publique
	  //constructeur par défaut
	  //constructeur avec arguments
	  
	  //le constructeur par défaut existe par défaut si on
	  // on a pas crée de constructeur avec arguments
  
  public Voiture() {
      
  }
  
  
  
  //constructeur avec arguments
  public Voiture(String marque_voiture, String couleur_voiture, int poids_voiture) {
      
  
      this.marque =marque_voiture;
      this.couleur= couleur_voiture;
      this.poids=poids_voiture;
      
  }
  
  
  //constructeur avec arguments
  public Voiture(String marque_voiture) {
      
      this.marque =marque_voiture;

      
  }
  
  
  
  //retourne une chaine de caractères contenant toutes les carctèristques d'un objet voiture
  public String toString() {
      
      return "marque :"+ marque+ " couleur : "+ couleur+ " poids : "+ poids;
      
      
  }
  
  
  
  //méthode getMarque pour accéder à la marque la voiture
  
  public String getMarque() {
      return this.marque;
  }
  
  
  //méthode pour modifier la valeur de la marque
  
  public void setMarque(String marque_voiture) {
      this.marque = marque_voiture;//l'attribut marque = la marque que l'utilisateur donne en paramètre
  }

}