package at.campus02.musikanten;

import java.util.Arrays;

public abstract class Musikant {
    protected int anzahlBeine;
    protected Instrument instrument;

    public Musikant(int anzahlBeine, Instrument instrument) {
        this.anzahlBeine = anzahlBeine;
        this.instrument = instrument;
    }

    public Musikant() {

    }


    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {

        return "Musikant{" +
                "anzahlBeine=" + anzahlBeine +
                ", instrument=" + instrument +
                ", Verscheucht= " +verscheueRaeuber() +
                ", Musiziert= " + spieleMusik() +
                '}';

    }

    public abstract int verscheueRaeuber();
    public abstract double spieleMusik();

}
