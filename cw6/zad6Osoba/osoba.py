class Osoba:
    __nazwisko: str
    __rok_urodzenia: int

    __slots__ = ["__nazwisko", "__rok_urodzenia"]

    def __init__(self,nazwisko: str, rok_urodzenia: int) -> None:
        self.__nazwisko= nazwisko
        self.__rok_urodzenia = rok_urodzenia