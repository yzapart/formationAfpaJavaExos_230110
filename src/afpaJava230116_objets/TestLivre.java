package afpaJava230116_objets;

public class TestLivre {

	public static void main(String[] args) {
		Livre l1 = new Livre("id001", "Les portes de la perception","Aldous Huxley", 15);
		Livre l2 = new Livre("id002", "Petite Poucette","Michel Serres", 9);
		Livre l3 = new Livre("id003", "DSA with Python","Mitnick", 44);
		
		l1.afficher();
		l1.setTitre("allo");
		l1.afficher();
		
		System.out.println("--");
	
	}
}
