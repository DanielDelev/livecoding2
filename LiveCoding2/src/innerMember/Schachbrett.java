package innerMember;

public class Schachbrett {

	private class Schachfeld {
	
		private Schachfigur figur;
	
		public Schachfeld () {
	
			this.figur = null;
	
		}
	
		public void setSpielfigur (boolean istSchwarz, String typ) {
	
			this.figur = new Schachfigur(istSchwarz, typ);
	
		}
	
	}

	Schachfeld[][] schachbrett;

	public Schachbrett () {

		setSchachbrett();

	}

	private void setSchachbrett () {

		schachbrett = new Schachfeld[8][8];

		for (byte i = 0; i < schachbrett.length; i++) {

			for (byte q = 0; q < schachbrett.length; q++) {

				schachbrett[i][q] = new Schachfeld();

			}

		}

	}

}
