package pl.kmmi.wmii.uwm.nazwisko;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Osoba implements Comparable<Osoba>, Cloneable {

    public Osoba(String nazwisko, LocalDate dataUrodzenia)
    {
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() +" ["+
                this.nazwisko+", "+
                this.dataUrodzenia.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "]";
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (this.getClass() != otherObject.getClass())
            return false;
        Osoba other = (Osoba) otherObject;
        return this.nazwisko.equals(other.nazwisko) &&
                this.dataUrodzenia.equals(other.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba o) {
        int comparision = this.nazwisko.compareTo(o.nazwisko);
        if (comparision != 0)
            return comparision;
        return this.dataUrodzenia.compareTo(o.dataUrodzenia);
    }

    public Osoba clone() throws CloneNotSupportedException
    {
        Osoba cloned = (Osoba) super.clone();
        return cloned;
    }

    private String nazwisko;
    private LocalDate dataUrodzenia;
}
