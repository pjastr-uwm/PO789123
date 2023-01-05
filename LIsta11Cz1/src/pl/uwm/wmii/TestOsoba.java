package pl.uwm.wmii;

class TestOsoba {

    public static void main(String[] args)
    {
        Osoba o1 = new Osoba("Kowalski", 2001);
        System.out.println(o1);
        Osoba o2 = new Osoba("Kowalski", 2001);
        System.out.println(o1.equals(o2));
        Nauczyciel n1 = new Nauczyciel("Nowak", 1990, 4000.00);
        System.out.println(n1);
        Osoba n2 = new Nauczyciel("Nowak", 1990, 4000.00);
        System.out.println(n2);
        Nauczyciel n3 = new Nauczyciel("Nowak", 1990, 4000.00);
        System.out.println(n1.equals(n3));
        System.out.println(n2.equals(n3));
        System.out.println(n3.equals(n2));
        Osoba o4 = new Osoba("Nowak", 1990);
        System.out.println(n3.equals(o4));
        System.out.println(n2.equals(o4));
        System.out.println(o4.equals(n3));
    }
}
