class Point:
    __x: float
    __y: float

    __slots__ = ["__x", "__y"]

    def __init__(self, x: float, y: float) -> None:
        self.__x = x
        self.__y = y

    @property
    def x(self) -> float:
        return self.__x

    @x.setter
    def x(self, value: float) -> None:
        self.__x = value

    @x.deleter
    def x(self) -> None:
        raise AttributeError("Nie mozna usunąć atrybutu x")

    @property
    def y(self) -> float:
        return self.__y

    @y.setter
    def y(self, value: float) -> None:
        self.__y = value

    @y.deleter
    def y(self) -> None:
        raise AttributeError("Nie mozna usunąć atrybutu y")

    def __str__(self) -> str:
        return f"x={self.x}, y={self.y}"

    def __repr__(self) -> str:
        return (f"{self.__module__}."
                f"{self.__class__.__name__}"
                f"x={self.x}, y={self.y}")