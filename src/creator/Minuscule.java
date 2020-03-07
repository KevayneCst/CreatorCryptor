package creator;

public class Minuscule {
	private String laMin; //!NBR
	
	public Minuscule() {
		String end="!";
		int nbr = Mixeur.between(97, 122);
		switch (nbr) {
		case 97:
			end+=((int)Alphabet.A.getValeur())-64;
			break;
		case 98:
			end+=((int)Alphabet.B.getValeur())-64;
			break;
		case 99:
			end+=((int)Alphabet.C.getValeur())-64;
			break;
		case 100:
			end+=((int)Alphabet.D.getValeur())-64;
			break;
		case 101:
			end+=((int)Alphabet.E.getValeur())-64;
			break;
		case 102:
			end+=((int)Alphabet.F.getValeur())-64;
			break;
		case 103:
			end+=((int)Alphabet.G.getValeur())-64;
			break;
		case 104:
			end+=((int)Alphabet.H.getValeur())-64;
			break;
		case 105:
			end+=((int)Alphabet.I.getValeur())-64;
			break;
		case 106:
			end+=((int)Alphabet.J.getValeur())-64;
			break;
		case 107:
			end+=((int)Alphabet.K.getValeur())-64;
			break;
		case 108:
			end+=((int)Alphabet.L.getValeur())-64;
			break;
		case 109:
			end+=((int)Alphabet.M.getValeur())-64;
			break;
		case 110:
			end+=((int)Alphabet.N.getValeur())-64;
			break;
		case 111:
			end+=((int)Alphabet.O.getValeur())-64;
			break;
		case 112:
			end+=((int)Alphabet.P.getValeur())-64;
			break;
		case 113:
			end+=((int)Alphabet.Q.getValeur())-64;
			break;
		case 114:
			end+=((int)Alphabet.R.getValeur())-64;
			break;
		case 115:
			end+=((int)Alphabet.S.getValeur())-64;
			break;
		case 116:
			end+=((int)Alphabet.T.getValeur())-64;
			break;
		case 117:
			end+=((int)Alphabet.U.getValeur())-64;
			break;
		case 118:
			end+=((int)Alphabet.V.getValeur())-64;
			break;
		case 119:
			end+=((int)Alphabet.W.getValeur())-64;
			break;
		case 120:
			end+=((int)Alphabet.X.getValeur())-64;
			break;
		case 121:
			end+=((int)Alphabet.Y.getValeur())-64;
			break;
		case 122:
			end+=((int)Alphabet.Z.getValeur())-64;
			break;
		}
		this.laMin=end;
	}

	public String getLaMin() {
		return laMin;
	}
}
