package at.campus02.musikanten;

public class Katze extends Musikant {
    protected double kratzKraft;

    public Katze(int aB, Instrument i, double kratzKraft) {
        super(aB, i);
        this.kratzKraft = kratzKraft;

    }


    @Override
    public int verscheueRaeuber() {

        int verscheuchteRaeuber = (int) Math.floor(kratzKraft);
        if (anzahlBeine == 3) {
            verscheuchteRaeuber = (int) Math.floor(kratzKraft / 2);
        } else if (anzahlBeine <= 2) {
            verscheuchteRaeuber = 1;
        }


        return verscheuchteRaeuber;
    }

    @Override
    public double spieleMusik() {
        return instrument.getLautstaerke();
    }

    public double getKratzKraft() {
        return kratzKraft;
    }

    @Override
    public String toString() {

        return getClass().getName() + " " + kratzKraft + ": " + super.toString();
    }
}
