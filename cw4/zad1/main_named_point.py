from punkt_alfa import Point
from named_point import NamedPoint


def main():
    a: NamedPoint = NamedPoint(3, 4, "latarnia")
    c: Point = Point(5, 9)
    print(Point.distance(c, a))


if __name__ == "__main__":
    main()
