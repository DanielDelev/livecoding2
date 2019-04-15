package schach;

public class Spielfeld {
	
	Spielfigur figur;
	
	public Spielfeld () {
		
		figur = null;
		
	}
	
	public void setSpielfigur (boolean istSchwarz, String figurTyp) {
		
		this.figur = new Spielfigur(istSchwarz, figurTyp);
		
	}

}
