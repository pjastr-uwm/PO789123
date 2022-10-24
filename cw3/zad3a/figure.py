class Rectangle:

    def __init__(self, a: float, b: float) -> None:
        self.a: float = a
        self.b: float = b

    def area(self) -> float:
        return self.a * self.b


def describe(rect: Rectangle) -> None:
    print(f"Długości boków: {rect.a} {rect.b}")
    print(f"Pole: {rect.area()}")

