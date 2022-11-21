class Osoba:
    _ile = 4000
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

    def __str__(self):
        return f"{self.nazwisko}, {self.rok_urodzenia}"
        # return f"{self.__nazwisko}, {self.__rok_urodzenia}"

    @classmethod
    def get_ile(cls):
        return cls._ile

    @classmethod
    def zwieksz_pobory(cls, ile_procent):
        cls._ile += ile_procent/100 * cls._ile