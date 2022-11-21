class Student:
    student_name: str
    student_id: int

    def __init__(self, student_id: int, student_name: str) -> None:
        self.student_name = student_name
        self.student_id = student_id

