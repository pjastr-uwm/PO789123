from osoba import  Osoba, Pracownik

def main() -> None:
    o1: Osoba = Osoba("Kowalski",2000)
    # o1.abc = 3
    print(o1.nazwisko)
    o1.nazwisko = "Nowak"
    print(o1.nazwisko)
    print(o1.rok_urodzenia)
    print(o1)
    print(Osoba.get_ile())
    Osoba.zwieksz_pobory(50)
    print(Osoba.get_ile())
    ## komendy z polecenia
    print(Osoba.get_ile())
    o2: Osoba = Osoba("Nowak", 1995)
    print(o2.get_ile())
    p1: Pracownik = Pracownik("Tuwim", 1900, 1920, 2000)
    print(p1.get_ile())
    del o2
    del p1
    # print(p1)
    print(Pracownik.get_ile())


if __name__ == "__main__":
    main()