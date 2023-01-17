package afpaJava230116_objets;

public class TestVoiture {

    
    
    //dans le main : on crée les objets + appel des méthodes
    
    public static void main(String[] args) {

        
        //créer un objet de type voiture
        // new : instancier la classe
        Voiture v1 = new  Voiture();
        // v1.toString : pour appeler la méthode toString
        System.out.println(v1.toString());
        
        //créer un objet de type voiture avec le constructeur..
        Voiture v2 = new Voiture("BMW", "Rouge", 1500);
        
        System.out.println(v2.toString());
        
        //afficher la marque la voiture v2
        System.out.println(v2.getMarque());
        
        v2.setMarque("Audi");
        
        System.out.println(v2.getMarque());
        
        
        
        
        v1.setMarque(null);
        
    }

}