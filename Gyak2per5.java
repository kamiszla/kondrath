
public class Gyak2per5 {
	
	public static void main(String[] args){
		Valami v = new Valami();
		System.out.println("Adja meg hány számot kíván megadni!");
		int n = v.beolvas();
		int[] tomb = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("Adja meg a következő elemet!");
			tomb[i] = v.beolvas();
		}
		int min = tomb[0];
		int minIndex = 0;
		for(int i = 1; i < tomb.length; i++){
			if(tomb[i] < tomb[minIndex]){
				minIndex=i;
				min = tomb[i];
			}		
		}
		System.out.println("A tömb legkisebb eleme: "+ min + ", aminek sorszáma: "+ (minIndex+1));
	}
}
