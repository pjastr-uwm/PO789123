import java.util.*;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];
        ludzie[0] = new Pracownik("Jan Kowalski", new String[]{"Janek", "Zosia"}, 50000);
        ludzie[1] = new Student("Małgorzata Nowak", new String[]{"Janek", "Zosia"}, "informatyka");
        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}

abstract class Osoba
{
    public Osoba(String nazwisko, String[] imiona)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String[] getImiona() {
        return this.imiona;
    }

    private String nazwisko;
    private String[] imiona;
}

class Pracownik extends Osoba
{
    public Pracownik(String nazwisko,String[] imiona,  double pobory)
    {
        super(nazwisko, imiona);
        this.pobory = pobory;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
}


class Student extends Osoba
{
    public Student(String nazwisko, String[] imiona, String kierunek)
    {
        super(nazwisko, imiona);
        this.kierunek = kierunek;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    private String kierunek;
}

