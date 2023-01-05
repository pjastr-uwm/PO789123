package pl.uwm.wmii;

import java.util.Objects;

class Osoba {
    public Osoba(String nazwisko, int rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" + "nazwisko='" + this.nazwisko + '\'' +
                ", rokUrodzenia=" + this.rokUrodzenia + '}';
    }

    public int getRokUrodzenia() {
        return this.rokUrodzenia;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return this.rokUrodzenia == osoba.rokUrodzenia && this.nazwisko.equals(osoba.nazwisko);
    }

    private String nazwisko;
    private int rokUrodzenia;
}
