from __future__ import annotations
from math import sqrt


class Point(object):
    x: float
    y: float

    def __init__(self, x: float, y: float) -> None:
        self.x = x
        self.y = y

    def __str__(self) -> str:
        return f'<{self.x}, {self.y}>'

    def move(self, delta_x: float, delta_y: float) -> None:
        self.x += delta_x
        self.y += delta_y

    @staticmethod
    def distance(p1: Point, p2: Point) -> float:
        return sqrt((p1.x - p2.x) ** 2 + (p1.y - p2.y) ** 2)
