package pl.uwm.wmii;

import java.util.Objects;

class Nauczyciel extends Osoba{
    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" + "nazwisko='" + getNazwisko() + '\'' +
                ", rokUrodzenia=" + getRokUrodzenia() +
                ", pensja=" + this.pensja +
                '}';
    }

    public double getPensja() {
        return pensja;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }
        Nauczyciel other = (Nauczyciel) otherObject;
        return this.pensja == other.pensja;
    }

    private double pensja;
}
