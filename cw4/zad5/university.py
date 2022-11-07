class Student:
    name: str
    surname: str
    all_quizes: float
    quizes: int

    def __init__(self, name: str, surname: str, all_quizes: float,
                 quizes: int) -> None:
        self.name = name
        self.surname = surname
        self.all_quizes = all_quizes
        self.quizes = quizes

    def get_name(self) -> str:
        return self.name

    def add_quiz(self, score: float) -> None:
        self.all_quizes += score
        self.quizes += 1

    def get_total_score(self) -> float:
        return self.all_quizes

    def get_average_score(self) -> float:
        return self.all_quizes / self.quizes
