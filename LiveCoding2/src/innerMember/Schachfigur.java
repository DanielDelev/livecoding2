package innerMember;

import enums.EnumFarbe;
import enums.EnumFigurTyp;

public class Schachfigur {

	EnumFarbe farbe;
	EnumFigurTyp typ;

	public Schachfigur (boolean istSchwarz, String figurTyp) {

		setFigur(istSchwarz, figurTyp);

	}

	private void setFigur (boolean istSchwarz, String figurTyp) {

		if (figurTyp == null || figurTyp.length() < 4) {

			throw new RuntimeException("Ungueltiger Figurtyp.");

		}

		if (istSchwarz) {

			this.farbe = EnumFarbe.SCHWARZ;

		} else {

			this.farbe = EnumFarbe.WEISS;

		}

		switch (figurTyp) {

		case "Koenig": typ = EnumFigurTyp.KOENIG ; break;
		case "Dame": typ = EnumFigurTyp.DAME ; break;
		case "Laeufer": typ = EnumFigurTyp.LAEUFER ; break;
		case "Springer": typ = EnumFigurTyp.SPRINGER ; break;
		case "Turm": typ = EnumFigurTyp.TURM ; break;
		case "Bauer": typ = EnumFigurTyp.BAUER ; break;
		default: throw new RuntimeException("Ungueltiger Figurtyp.");

		}

	}

}