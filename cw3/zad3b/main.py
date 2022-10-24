from figure import Rectangle
from figure_describe import describe
from typing import List


def main():
    r1: Rectangle = Rectangle(3, 4)
    r2: Rectangle = Rectangle(2, 8)
    lista: List[Rectangle] = [r1, r2]
    for elem in lista:
        print(elem.area())

    r3: Rectangle = Rectangle(5, 7)
    describe(r3)


if __name__ == "__main__":
    main()
