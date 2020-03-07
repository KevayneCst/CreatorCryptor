package creator;

public class Brut {
	private String leBrut; //||NBR||
	
	public Brut() {
		String end="||";
		int nbr = Mixeur.between(0, 9);
		end+=Integer.toString(nbr);
		end+="||";
		this.leBrut=end;
	}

	public String getLeBrut() {
		return leBrut;
	}
}
