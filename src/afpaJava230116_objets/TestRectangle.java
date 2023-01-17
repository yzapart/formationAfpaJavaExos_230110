package afpaJava230116_objets;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3, 2);
		r1.afficherString();
		Rectangle r2 = new Rectangle(33.5, 21);
		r2.afficherString();
		Rectangle r3 = new Rectangle(4, 4);
		r3.afficherString();
		
		System.out.println("---");
		
		Rectangle[] t;
		t = new Rectangle[10];
		
		t[0] = r1;
		t[1] = r2;
		t[2] = r3;
		
		for (Rectangle r: t) {
			if (r != null) r.afficherString();
		}
		
	}
}
