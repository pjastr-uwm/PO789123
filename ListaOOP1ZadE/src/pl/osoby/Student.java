package pl.osoby;

class Student extends Osoba{

    public Student()
    {

    }

    public Student(String imie, String nazwisko, int rokUrodzenia, int rok, int numerGrupy, int numerAlbumu)
    {
        super(imie,nazwisko,rokUrodzenia);
        this.rok=rok;
        this.numerAlbumu=numerAlbumu;
        this.numerGrupy=numerGrupy;
    }

    @Override
    public void wypiszInfo()
    {
        System.out.printf("Student: Imie: %s, nazwisko: %s, rok urodzenia: %d%n", this.imie, this.nazwisko, this.rokUrodzenia);
        System.out.printf("Rok: %d, numer grupy: %d, numer albumu: %d%n",this.rok, this.numerGrupy, this.numerAlbumu);
    }

    private int rok;
    private int numerGrupy;
    private int numerAlbumu;
}
