package creator;

public enum Alphabet {
	A('A'),
	B('B'),
	C('C'),
	D('D'),
	E('E'),
	F('F'),
	G('G'),
	H('H'),
	I('I'),
	J('J'),
	K('K'),
	L('L'),
	M('M'),
	N('N'),
	O('O'),
	P('P'),
	Q('Q'),
	R('R'),
	S('S'),
	T('T'),
	U('U'),
	V('V'),
	W('W'),
	X('X'),
	Y('Y'),
	Z('Z');
	
	private char valeur;
	
	Alphabet(char s){
		valeur = s;
	}
	
	public char getValeur() {
		return valeur;
	}
	
	public static void main(String[] args) {
		for (Alphabet a: Alphabet.values()) {
			System.out.println(a.valeur);
		}
	}
}
