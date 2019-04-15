package konstrukorDesTeils;

public class Schachfeld {
	
	private Schachfigur figur;
	
	public Schachfeld (Schachbrett schachbrett) {
		
		if (schachbrett == null) {
			
			throw new RuntimeException("Spielfeld kann nicht ohne Spielbrett existieren.");
			
		}
		
		this.figur = null;
		
	}
	
	public void setFigur (boolean istSchwarz, String figurTyp) {
		
		this.figur = new Schachfigur(istSchwarz, figurTyp);
		
	}

}
