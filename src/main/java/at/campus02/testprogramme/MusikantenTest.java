package at.campus02.testprogramme;

import at.campus02.musikanten.Hahn;
import at.campus02.musikanten.Instrument;

public class MusikantenTest {

	public static void main(String[] args) {
		// Testen Sie hier Ihr Beispiel

		Hahn h1 = new Hahn(1,new Instrument("Trompete",6.8),1);

		System.out.println(h1.verscheueRaeuber());

	}

}
