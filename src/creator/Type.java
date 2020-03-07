package creator;

public enum Type {
	SIMPLE("Simple"),
	RARE("Rare"),
	COMPLEXE("Complexe");
	
	private String valeur;
	
	Type(String s ) {
		valeur = s;
	}
	
	public String getValeur() {
		return valeur;
	}
	
	public static void main(String[] args) {
		for (Type t : Type.values()) {
			System.out.println(t.valeur);
		}
	}
}
