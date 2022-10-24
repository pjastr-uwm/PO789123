from typing import List

class Stat:

    def __init__(self, list: List[float]) -> None:
        self.list: List[float] = list

    def xsum(self) -> float:
        return sum(self.list)

    def xmin(self) -> float:
        return min(self.list)

    def xmax(self) -> float:
        return max(self.list)