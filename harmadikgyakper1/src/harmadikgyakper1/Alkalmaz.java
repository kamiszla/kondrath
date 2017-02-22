package harmadikgyakper1;

public class Alkalmaz {

	public static void main(String[] args) {
		Alkalmazott a = new Alkalmazott("Kis Pista");
		System.out.println(a.osszefuz());
		a.novel(500000);
		System.out.println(a.osszefuz());
	}
}