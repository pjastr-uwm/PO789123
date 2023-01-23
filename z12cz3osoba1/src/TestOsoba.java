import pl.kmmi.wmii.uwm.nazwisko.Osoba;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {

    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa = new ArrayList<>();
        grupa.add(new Osoba("Kowalski", LocalDate.of(2000,1,1)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(2014,5,1)));
        grupa.add(new Osoba("Nowak", LocalDate.of(1999,6,11)));
        grupa.add(new Osoba("Nowak", LocalDate.of(2010,6,11)));
        grupa.add(new Osoba("Wilenski", LocalDate.of(2000,6,1)));
        System.out.println("przed");
        for(Osoba elem: grupa)
        {
            System.out.println(elem);
        }
        grupa.sort(null);
        System.out.println("po");
        for(Osoba elem: grupa)
        {
            System.out.println(elem);
        }

    }
}
