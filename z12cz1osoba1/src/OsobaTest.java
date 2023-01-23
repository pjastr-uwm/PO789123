import pl.uwm.wmii.kmmi.nazwisko.Osoba;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class OsobaTest {

    public static void main(String[] args)
    {
        Osoba[] grupa ={
                new Osoba("Kowalski", LocalDate.of(2000,1,1)),
                new Osoba("Kowalski", LocalDate.of(2003,3,2)),
                new Osoba("Nowak", LocalDate.of(1999,11,21)),
                new Osoba("Nowak", LocalDate.of(2010,2,21)),
                new Osoba("Wileński", LocalDate.of(2000,1,1))
        };

        System.out.println("Przed");
        for(Osoba elem: grupa)
        {
            System.out.println(elem);
        }
        Arrays.sort(grupa);
        System.out.println("Po");
        for(Osoba elem: grupa)
        {
            System.out.println(elem);
        }
        System.out.println("Test ile");
        for(Osoba elem: grupa)
        {
            System.out.printf("Lat: %d, Miesiecy: %d, Dni: %d%n", elem.ileLat(),
                    elem.ileMiesiecy(), elem.ileDni());
        }


    }
}
