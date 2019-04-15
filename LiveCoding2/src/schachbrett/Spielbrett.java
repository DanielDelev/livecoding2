package schachbrett;

public class Spielbrett {
	
	Spielfeld[][] spielbrett = new Spielfeld[8][8];
	
	public Spielbrett () {
		
		setSpielbrett();
		
	}
	
	private void setSpielbrett () {
		
		this.spielbrett = spielbrett;
		
		for (int i = 0; i < spielbrett.length; i++) {
			
			for (int q = 0; q < spielbrett.length; q++) {
				
				spielbrett[i][q] = new Spielfeld();
				
			}
			
		}
		
	}
	
	public void setFigur (int i, int q) {
		
		spielbrett[i][q].setSpielfigur();
		
	}

}
