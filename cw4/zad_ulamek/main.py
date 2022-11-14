from liczby import Wymierna


def main() -> None:
    w1: Wymierna = Wymierna(-6, -3)
    print(w1)
    print(w1.get_licznik())
    print(w1.get_mianownik())
    print(w1.__float__())
    print(float(w1))
    w2: Wymierna = Wymierna(1, 3)
    print(float(w2))
    w3: Wymierna = Wymierna(2, 3)
    print(w2+w3)
    print(w2 == w3)
    w4: Wymierna = Wymierna(4, 6)
    print(w3 == w4)
    print(w3 != w4)
    print(w2 < w3)
    print(w2 <= w3)
    print(w2 > w3)
    print(w2 >= w3)


if __name__ == "__main__":
    main()
