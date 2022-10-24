from random import randint


class Coin:

    def __init__(self) -> None:
        self.side: bool = True

    def throw(self) -> None:
        if randint(0, 1):
            self.side = True
        else:
            self.side = False

    def show_side(self) -> bool:
        return self.side
