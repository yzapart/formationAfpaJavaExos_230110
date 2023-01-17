package afpaJava230116_objets;

public class testPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne("Pierre", 23);
		Personne p3 = new Personne("Christophe", 45);
		
		p1.afficher();
		p2.afficher();
		p3.afficher();
		
		p2.setAge(24);
		System.out.println(p2.getAge());
		
		p3.setNom("Christian");
		p3.afficher();
		
		System.out.println("------------");
		
		Personne[] t;
		t = new Personne[10];
		
		t[0] = new Personne("Pierre", 24);
		t[1] = new Personne("Rémi", 25);
		t[2] = new Personne("Joe", 33);
		t[3] = new Personne("Eric", 28);
		t[4] = new Personne("Toto", 18);
		
		
		for (Personne p: t) {
			if (p != null) p.afficher();
		}
		System.out.println("------------");
		
		t[4].setNom("Marie");
		
		for (Personne p: t) {
			if (p != null) p.afficher();
		}
		System.out.println("------------");
		
		
		System.out.println("--- recherche marie");
		Personne pr = recherche("Marie", t);
		pr.afficher();
		System.out.println("------------");
		
		System.out.println(nbPersonnes(t));
		System.out.println("------------");
		
		ajoutPersonne(new Personne("Wesh", 69), t);
		for (Personne p: t) {
			if (p != null) p.afficher();
		}
		System.out.println("------------");
		
	}
	
// ======================================================================= //
	
	static Personne recherche(String nom, Personne t[]) {
		for (Personne p: t) {
			if (p.getNom().equals(nom)) {
				return p;
			}
		}
		return null;
	}
	
	static int nbPersonnes(Personne t[]) {
		int count = 0;
		for (Personne p: t) {
			if (p != null) {
				count += 1 ;
			}
		}
		return count;
	}
	
	static void ajoutPersonne(Personne p, Personne t[]) {
		t[nbPersonnes(t)] = p;
	}
}
