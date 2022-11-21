class Osoba:
    __nazwisko: str
    __rok_urodzenia: int

    __slots__ = ["__nazwisko", "__rok_urodzenia"]

    def __init__(self,nazwisko: str, rok_urodzenia: int) -> None:
        self.__nazwisko= nazwisko
        self.__rok_urodzenia = rok_urodzenia

    @property
    def nazwisko(self) -> str:
        return self.__nazwisko

    @nazwisko.setter
    def nazwisko(self, value: str) ->None:
        self.__nazwisko = value

    @nazwisko.deleter
    def nazwisko(self) ->None:
        raise AttributeError("Nie można usunąć nazwiska")

    @property
    def rok_urodzenia(self) ->int:
        return self.__rok_urodzenia

    @rok_urodzenia.setter
    def rok_urodzenia(self, value: int) ->None:
        self.__rok_urodzenia= value

    @rok_urodzenia.deleter
    def rok_urodzenia(self) -> None:
        raise AttributeError("Nie można usunac rok urodzenia")