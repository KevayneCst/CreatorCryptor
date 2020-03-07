package creator;

public class Majuscule {
	private String laMaj; //NBR
	
	public Majuscule() {
		String end="";
		int nbr = Mixeur.between(65, 90);
		switch (nbr) {
		case 65:
			end+=((int)Alphabet.A.getValeur())-64;
			break;
		case 66:
			end+=((int)Alphabet.B.getValeur())-64;
			break;
		case 67:
			end+=((int)Alphabet.C.getValeur())-64;
			break;
		case 68:
			end+=((int)Alphabet.D.getValeur())-64;
			break;
		case 69:
			end+=((int)Alphabet.E.getValeur())-64;
			break;
		case 70:
			end+=((int)Alphabet.F.getValeur())-64;
			break;
		case 71:
			end+=((int)Alphabet.G.getValeur())-64;
			break;
		case 72:
			end+=((int)Alphabet.H.getValeur())-64;
			break;
		case 73:
			end+=((int)Alphabet.I.getValeur())-64;
			break;
		case 74:
			end+=((int)Alphabet.J.getValeur())-64;
			break;
		case 75:
			end+=((int)Alphabet.K.getValeur())-64;
			break;
		case 76:
			end+=((int)Alphabet.L.getValeur())-64;
			break;
		case 77:
			end+=((int)Alphabet.M.getValeur())-64;
			break;
		case 78:
			end+=((int)Alphabet.N.getValeur())-64;
			break;
		case 79:
			end+=((int)Alphabet.O.getValeur())-64;
			break;
		case 80:
			end+=((int)Alphabet.P.getValeur())-64;
			break;
		case 81:
			end+=((int)Alphabet.Q.getValeur())-64;
			break;
		case 82:
			end+=((int)Alphabet.R.getValeur())-64;
			break;
		case 83:
			end+=((int)Alphabet.S.getValeur())-64;
			break;
		case 84:
			end+=((int)Alphabet.T.getValeur())-64;
			break;
		case 85:
			end+=((int)Alphabet.U.getValeur())-64;
			break;
		case 86:
			end+=((int)Alphabet.V.getValeur())-64;
			break;
		case 87:
			end+=((int)Alphabet.W.getValeur())-64;
			break;
		case 88:
			end+=((int)Alphabet.X.getValeur())-64;
			break;
		case 89:
			end+=((int)Alphabet.Y.getValeur())-64;
			break;
		case 90:
			end+=((int)Alphabet.Z.getValeur())-64;
			break;
		}
		this.laMaj=end;
	}

	public String getLaMaj() {
		return laMaj;
	}
	
	
}
