from __future__ import annotations


class Address:
    house: int
    street: str
    flat: int
    city: str
    zipcode: str

    def __init__(self, city: str, zipcode: str, house: int, street: str,
                 flat: int = None) -> None:
        self.city = city
        self.zipcode = zipcode
        self.house = house
        self.street = street
        self.flat = flat

    def show(self) -> None:
        if self.flat is not None:
            print(f"{self.street} {self.house} {self.flat}")
        else:
            print(f"{self.street} {self.house}")

        print(f"{self.zipcode} {self.city}")

    def comes_before(self, other: Address) -> bool:
        return self.zipcode < other.zipcode
