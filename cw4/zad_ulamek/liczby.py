from __future__ import annotations
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

    def get_licznik(self) -> int:
        return self.p

    def get_mianownik(self) -> int:
        return self.q

    def __float__(self) -> float:
        return self.p/self.q

    def __add__(self, other: Wymierna) -> Wymierna:
        return Wymierna(self.p * other.q+self.q * other.p, self.q * other.q)
