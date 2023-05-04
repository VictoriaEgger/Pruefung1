package at.campus02.musikanten;

public class Hahn extends Musikant {
    protected int flugWeite;

    public Hahn(int aB, Instrument i, int flugWeite) {
        super(aB, i);
        this.flugWeite = flugWeite;

    }

    @Override
    public int verscheueRaeuber() {
        int verscheuchteRaeuber = 0;
        if (flugWeite < 2) {
            verscheuchteRaeuber = (int) instrument.getLautstaerke();
        }

        switch (flugWeite) {
            case 2:
                verscheuchteRaeuber = 6;
                break;
            case 3:
                verscheuchteRaeuber = 5;
                break;
            case 4:
                verscheuchteRaeuber = 4;
                break;
            case 5:
                verscheuchteRaeuber = 3;
                break;
            case 6:
                verscheuchteRaeuber = 2;
                break;
        }
        if (flugWeite > 6) {
            verscheuchteRaeuber = 1;
        }


        return verscheuchteRaeuber;
    }

    @Override
    public double spieleMusik() {
        return (instrument.getLautstaerke()+2)/flugWeite;
    }

    public int getFlugWeite() {
        return flugWeite;
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + flugWeite + ": " + super.toString();
    }
}
