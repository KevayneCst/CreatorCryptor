package creator;

public enum CarSpeciaux {
	AROBASE("@"),
	DIESE("#"),
	PERLUETE("&"),
	ETOILE("*"),
	EXCLAMATION("!"),
	INTERROGATION("?"),
	SECTION("§"),
	MICRO("µ"),
	TILDE("~");
	
	private String valeur;
	
	CarSpeciaux(String s) {
		valeur = s;
	}
	
	public String getValeur() {
		return valeur;
	}
	
	public static void main(String[] args) {
		for (CarSpeciaux c: CarSpeciaux.values()) {
			System.out.println(c.valeur);
		}
	}
}
