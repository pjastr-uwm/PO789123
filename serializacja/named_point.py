from point import Point


class NamedPoint(Point):
    __name: str

    __slots__ = ["__name"]

    def __init__(self, x: float, y: float, name: str) -> None:
        super().__init__(x, y)
        self.__name = name

    @property
    def name(self) -> str:
        return self.__name

    @name.setter
    def name(self, value: str) -> None:
        self.__name = value

    @name.deleter
    def name(self) -> None:
        raise AttributeError("Nie mozna usunąć atrybutu name")