from math import gcd


class Wymierna:
    p: int
    q: int

    def __init__(self, p: int, q: int) -> None:
        if q == 0:
            raise ValueError("Mianownik nie może być równy zero!")

        self.p = p
        self.q = q
        if gcd(self.p, self.q) != 1:
            self.p //= gcd(p, q)
            self.q //= gcd(p, q)

        if self.q < 0:
            self.p *= -1
            self.q *= -1

    def __repr__(self):
        return f"({self.p}, {self.q})"
