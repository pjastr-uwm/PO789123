package pl.osoby;

class Osoba {

    public Osoba()
    {

    }

    public Osoba(String imie, String nazwisko, int rokUrodzenia)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
    }

    public void wypiszInfo()
    {
        System.out.printf("Osoba: Imie: %s, nazwisko: %s, rok urodzenia: %d%n", this.imie, this.nazwisko, this.rokUrodzenia);
    }

    protected String imie;
    protected String nazwisko;
    protected int rokUrodzenia;
}
