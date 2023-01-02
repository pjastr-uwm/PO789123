package pl.uwm.wmii.kowalski;

public class TestAdres {

    public static void main(String[] args)
    {
        Adres a1 = new Adres("Sloneczna", 54, "Olsztyn", "12-710");
        a1.pokaz();
        Adres a2 = new Adres("Sloneczna", 54,10, "Olsztyn", "14-710");
        a2.pokaz();
        System.out.println(a1.przed(a2));
    }
}