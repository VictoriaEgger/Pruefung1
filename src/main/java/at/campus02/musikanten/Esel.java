package at.campus02.musikanten;

public class Esel extends Musikant {
	protected double trittkraft;

	public Esel(int aB, Instrument i, double trittkraft) {
		super(aB,i);
		this.trittkraft = trittkraft;

	}


	@Override
	public int verscheueRaeuber() {


		return (int) Math.floor(trittkraft*anzahlBeine);
	}

	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}

	public double getTrittkraft() {
		return trittkraft;
	}

	@Override
	public String toString() {
		return getClass().getName() + " " + trittkraft + ": " + super.toString();
	}


}
