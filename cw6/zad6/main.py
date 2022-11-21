from university import Student


def main() -> None:
    s1: Student = Student(2334)
    s1.student_data()
    s2: Student = Student(456,"Jan","Kowalski")
    s2.student_data()

    ## zadanie 7
    print(type(Student)) ## to nie o to chodzilo
    print(Student.__name__)
    print(Student.__dict__)
    print(Student.__module__)



if __name__ == "__main__":
    main()