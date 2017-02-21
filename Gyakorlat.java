package gyak;

public class Gyakorlat {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Adja meg a számok számát!");
		int n = Integer.parseInt(in.nextLine());
		int[] t = new int[n];
		int szum = 0;
		double atlag = 0;
		for(int i = 0; i < n; i++){
			System.out.println("Adja meg a következő számot!");
			t[i] = Integer.parseInt(in.nextLine());
			szum += t[i];
		}
		atlag = (double)szum / n;
		System.out.println("A megadott számok átlaga: "+ atlag);
	}

}
