package pl.osoby;

public class TestOsoba {

    public static void main(String[] args){
        Osoba o1 = new Osoba("Jan","Kowalski",1990);
        o1.wypiszInfo();
        Student s1 = new Student();
        Student s2 = new Student("Anna","Nowak",2000,2,3,123456);
        s2.wypiszInfo();

    }
}
