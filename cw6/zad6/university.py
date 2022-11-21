class Student:
    nazwa_ucznia: str
    klasa_ucznia: str
    student_id: int

    def __init__(self, student_id: int, nazwa_ucznia: str = "", klasa_ucznia: str = "") -> None:
        self.nazwa_ucznia = nazwa_ucznia
        self.klasa_ucznia = klasa_ucznia
        self.student_id = student_id

    def student_data(self) -> None:
        print(self.student_id)
        if self.nazwa_ucznia != "":
            print(self.nazwa_ucznia)

        if self.klasa_ucznia != "":
            print(self.klasa_ucznia)