package creator;

public class Speciaux {
	private String leSpe; //SPE
	
	public Speciaux(Type t) {
		String end="";
		
		if (t.equals(Type.SIMPLE)) {
			int nbr = Mixeur.between(1, 30);
			if (nbr < 12) {
				end+=CarSpeciaux.AROBASE.getValeur();
			} else if ((nbr >= 12) && (nbr < 24)) {
				end+=CarSpeciaux.DIESE.getValeur();
			} else {
				end+=CarSpeciaux.PERLUETE.getValeur();
			}
		} else if (t.equals(Type.RARE)) {
			int nbr = Mixeur.between(1, 6);
			switch(nbr) {
			case 1:
				end+=CarSpeciaux.AROBASE.getValeur();
				break;
			case 2:
				end+=CarSpeciaux.DIESE.getValeur();
				break;
			case 3:
				end+=CarSpeciaux.PERLUETE.getValeur();
				break;
			case 4:
				end+=CarSpeciaux.ETOILE.getValeur();
				break;
			case 5:
				end+=CarSpeciaux.EXCLAMATION.getValeur();
				break;
			case 6:
				end+=CarSpeciaux.INTERROGATION.getValeur();
				break;
			}
		} else {
			int nbr = Mixeur.between(1, 9);
			switch(nbr) {
			case 1:
				end+=CarSpeciaux.AROBASE.getValeur();
				break;
			case 2:
				end+=CarSpeciaux.DIESE.getValeur();
				break;
			case 3:
				end+=CarSpeciaux.PERLUETE.getValeur();
				break;
			case 4:
				end+=CarSpeciaux.ETOILE.getValeur();
				break;
			case 5:
				end+=CarSpeciaux.EXCLAMATION.getValeur();
				break;
			case 6:
				end+=CarSpeciaux.INTERROGATION.getValeur();
				break;
			case 7:
				end+=CarSpeciaux.SECTION.getValeur();
				break;
			case 8:
				end+=CarSpeciaux.MICRO.getValeur();
				break;
			case 9:
				end+=CarSpeciaux.TILDE.getValeur();
				break;
			}
		}
		this.leSpe=end;
	}
	
	public String getLeSpe() {
		return leSpe;
	}
}
