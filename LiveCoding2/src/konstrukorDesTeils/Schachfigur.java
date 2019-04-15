package konstrukorDesTeils;

import enums.EnumFarbe;
import enums.EnumFigurTyp;

public class Schachfigur {
	
	private EnumFarbe figurFarbe;
	private EnumFigurTyp figurTyp;
	
	public Schachfigur (boolean farbe, String typ) {
		
		setFigur(farbe, typ);
		
	}
	
	private void setFigur (boolean farbe, String typ) {
		
		if (typ == null || typ.length() < 4) {
			
			throw new RuntimeException("Ungueltiger Figurtyp.");
			
		}
		
		if (farbe) {
			
			this.figurFarbe = EnumFarbe.SCHWARZ;
			
		} else {
			
			this.figurFarbe = EnumFarbe.WEISS;
			
		}
		
		switch (typ) {
		
		case "Koenig": figurTyp = EnumFigurTyp.KOENIG ; break;
		case "Dame": figurTyp = EnumFigurTyp.DAME ; break;
		case "Laeufer": figurTyp = EnumFigurTyp.LAEUFER ; break;
		case "Springer": figurTyp = EnumFigurTyp.SPRINGER ; break;
		case "Turm": figurTyp = EnumFigurTyp.TURM ; break;
		case "Bauer": figurTyp = EnumFigurTyp.BAUER ; break;
		default: throw new RuntimeException("Ungueltiger Figurtyp.");
		
		}
		
	}

}
