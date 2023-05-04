package at.campus02.musikanten;

public class Hund extends Musikant {
    protected double bellLautstaerke;

    public Hund(int aB, Instrument i, double bellLautstaerke) {
        super(aB, i);
        this.bellLautstaerke = bellLautstaerke;
    }

    @Override
    public int verscheueRaeuber() {
        System.out.println("Hund bellt " + bellLautstaerke + "  oder spielt das Instrument " + getInstrument().getName() + " ,aber nix geschieht");
        if (bellLautstaerke > instrument.getLautstaerke()) {
            return (int) Math.floor(bellLautstaerke);
        } else {
            return (int) Math.floor(instrument.getLautstaerke());
        }


    }

    @Override
    public double spieleMusik() {

        return 2/(bellLautstaerke + instrument.getLautstaerke());
    }

    public double getBellLautstaerke() {
        return bellLautstaerke;
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + bellLautstaerke + ": " + super.toString();
    }
}
