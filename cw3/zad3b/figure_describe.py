from figure import Rectangle


def describe(rect: Rectangle) -> None:
    print(f"Długości boków: {rect.a} {rect.b}")
    print(f"Pole: {rect.area()}")
