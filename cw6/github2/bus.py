from car import Car


class Bus(Car):
    seats: int

    def __init__(self, model: str, price: int, seats: int) -> None:
        super().__init__(model, price)
        self.seats = seats

    def __str__(self) -> str:
        return super(Bus, self).__str__() + f" {self.seats}"
