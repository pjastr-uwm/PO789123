package pl.kmmi.wmii.uwm.nazwisko;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcena) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen=sredniaOcena;
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() +" ["+
                getNazwisko()+", "+
                getDataUrodzenia().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +", "+
                this.sredniaOcen+"]";
    }

    public Student clone() throws CloneNotSupportedException
    {
        Student cloned = (Student) super.clone();
        return cloned;
    }

    public int compareTo(Osoba s)
    {
        if (s instanceof Student)
        {
            Student s2 = (Student) s;
            int comparison = super.compareTo(s2);
            if (comparison!=0)
                return comparison;
            return Double.compare(this.sredniaOcen , s2.sredniaOcen);
        }
        return super.compareTo(s);

    }

    private double sredniaOcen;
}
