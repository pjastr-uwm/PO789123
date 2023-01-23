import pl.kmmi.wmii.uwm.nazwisko.Osoba;
import pl.kmmi.wmii.uwm.nazwisko.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<>();
        grupa.add(new Student("Kowalski", LocalDate.of(2000,1,1),
                3.4));
        grupa.add(new Student("Kowalski", LocalDate.of(2014,5,1),
                2.9));
        grupa.add(new Student("Nowak", LocalDate.of(1999,6,11),
                4.5));
        grupa.add(new Student("Nowak", LocalDate.of(2010,6,11),
                5.0));
        grupa.add(new Student("Kowalski", LocalDate.of(2000,1,1),
                1.1));
        System.out.println("przed");
        for(Student elem: grupa)
        {
            System.out.println(elem);
        }
        grupa.sort(null);
        System.out.println("po");
        for(Student elem: grupa)
        {
            System.out.println(elem);
        }
    }
}
