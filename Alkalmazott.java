package harmadikgyakper1;

public class Alkalmazott {
	private String nev;
	private double fizetes;
	
	public Alkalmazott(String nev){
		this.nev = nev;	
	}
	
	public void novel(double osszeg){
		fizetes += osszeg;
	}
	public String osszefuz(){
		String osszefuzott;
		osszefuzott = nev + "\t"+fizetes;
		return osszefuzott;
	}
}
