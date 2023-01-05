package pl.uwm.wmii;

class TestOsoba {

    public static void main(String[] args)
    {
        Osoba o1 = new Osoba("Kowalski", 2001);
        System.out.println(o1);
        Osoba o2 = new Osoba("Kowalski", 2001);
        System.out.println(o1.equals(o2));
    }
}
