from car import Car
from bus import Bus


def main() -> None:
    c1: Car = Car("Fiat", 20000)
    print(c1)
    b1: Bus = Bus("Skoda", 30000, 40)
    print(b1)


if __name__ == "__main__":
    main()
