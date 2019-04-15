package konstrukorDesTeils;

public class Schachbrett {
	
	Schachfeld[][] schachbrett;
	
	public Schachbrett () {
	
		setSchachbrett();
		
	}
	
	private void setSchachbrett () {
		
		schachbrett = new Schachfeld[8][8];
		
		for (byte i = 0; i < schachbrett.length; i++) {
			
			for (byte q = 0; q < schachbrett[i].length; q++) {
				
				schachbrett[i][q] = new Schachfeld(this);
				
			}
			
		}
		
	}

}
