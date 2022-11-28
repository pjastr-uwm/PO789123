class Car:
    __model: str
    __price: int

    def __init__(self, model: str, price: int) -> None:
        self.__model = model
        self.__price = price

    def __str__(self) -> str:
        return f"{self.__model} {self.__price}"
