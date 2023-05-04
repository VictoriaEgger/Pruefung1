package at.campus02.musikanten;

import java.util.*;

public class Quartett {

    ArrayList<Musikant> bremerstadtmusikanten;

    public Quartett(ArrayList<Musikant> bremerstadtmusikanten) {
        this.bremerstadtmusikanten = bremerstadtmusikanten;
    }

    public void add(Musikant m) {
        bremerstadtmusikanten.add(m);
    }

    public boolean istQuartett() {
        if (bremerstadtmusikanten.size() == 4) {
            return true;
        } else {
            return false;
        }
    }

    public int gemeinsamRaeuberVerscheucht() {
        int alleRaeuber = 0;
        Iterator<Musikant> it = bremerstadtmusikanten.iterator();
        while (it.hasNext()) {
            Musikant musikant = it.next();
            alleRaeuber = musikant.verscheueRaeuber();
        }
        return alleRaeuber;
    }


    public double durchschnittlicheLautstaerke() {
        double durchschnitt = 0;
        for (int i = 0; i < bremerstadtmusikanten.size(); i++) {
            durchschnitt = bremerstadtmusikanten.get(i).spieleMusik() / bremerstadtmusikanten.size();
        }
        return durchschnitt;
    }

    public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis) {
        ArrayList<Musikant> ergebniss = new ArrayList<>();

        for (int i = 0; i < bremerstadtmusikanten.size(); i++) {
            if (bremerstadtmusikanten.get(i).spieleMusik() >= von && bremerstadtmusikanten.get(i).spieleMusik() <= bis) {
                ergebniss.add(bremerstadtmusikanten.get(i));
            }
        }
        return ergebniss;
    }

    public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl() {
        HashMap<Integer, Integer> ergebniss = new HashMap<>();

        for (int i = 0; i < bremerstadtmusikanten.size(); i++) {
            if (bremerstadtmusikanten.get(i).anzahlBeine == 2) {
            }
            return null;
        }

        public void printLautStaerkeAbsteigend () {

        }
    }
}
