from osoba import  Osoba

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


if __name__ == "__main__":
    main()