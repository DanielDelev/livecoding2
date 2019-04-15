package schachbrett;

import enums.Spielfigur;

class Spielfeld {
	
	Spielfigur figur;
	
	public Spielfeld () {
		
		figur = null;
		
	}
	
	public void setSpielfigur () {
		
		this.figur = new Spielfigur();
		
	} 

}
