package creator;
import java.util.Random;


public class Mixeur {
	private String mixer;
	private int marque = Mixeur.between(1, 7);
	private int puissance;
	private Type coffre;
	
	public Mixeur(int puissance, Type coffre) {
		String end="";
		for (int i=0; i<puissance; i++) {
			int choix = Mixeur.between(0, 100);
			
			if (choix <35) { //------------------------------Entre 0 et 34 SOIT ===> MAJUSCULE 34 %
				
				Majuscule maj = new Majuscule();
				end+=maj.getLaMaj()+" ";
				
			} else if (choix >=35 && choix <65) { //---------Entre 35 et 64 SOIT ===> MINUSCULE 29 %
				
				Minuscule min = new Minuscule();
				end+=min.getLaMin()+" ";
				
			} else if (choix >=65 && choix < 95) { //--------Entre 65 et 94 SOIT ===> BRUT 29 %

				Brut bru = new Brut();
				end+=bru.getLeBrut()+" ";
				
			} else { //--------------------------------------Entre 95 et 100 SOIT ===> SPECIAUX 5 %

				Speciaux spe = new Speciaux(coffre);
				end+=spe.getLeSpe()+" ";
				
			}
		}
		
		this.mixer=end;
		this.puissance=puissance;
		this.coffre=coffre;
	}
	
	public static int between(int inf, int sup) {
		Random rdm = new Random();
		int nbr;
		nbr = inf+rdm.nextInt((sup+1)-inf);
		return nbr;
	}
	
	
	public String getMixer() {
		return mixer;
	}

	public void setMixer(String mixer) {
		this.mixer = mixer;
	}

	@Override
	public String toString() {
		String end="";
		for (int i=0; i<puissance*5; i++) {
			end+="-";
		}
		end+="\n";
		end+=mixer+"\nMarque du mixeur: "+marque;
		return end;
	}
}
