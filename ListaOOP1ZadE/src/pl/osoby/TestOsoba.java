package pl.osoby;

public class TestOsoba {

    public static void main(String[] args){
//        Osoba o1 = new Osoba("Jan","Kowalski",1990);
//        o1.wypiszInfo();
//        Student s1 = new Student();
//        Student s2 = new Student("Anna","Nowak",2000,2,3,123456);
//        s2.wypiszInfo();
//        Osoba x1 = new Student("Anna","Nowak",2000,2,3,123456);
//        x1.wypiszInfo();
        Student student3 = new Student("Anna","Nowak",2000,2,3,123456);
        Osoba osoba3 = student3;
        osoba3.wypiszInfo();
        Student student4 = (Student) osoba3;
        student4.wypiszInfo();
    }
}
