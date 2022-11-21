from university import Student


def main() -> None:
    s1: Student = Student(2334,"Jan")
    s1.student_class = "IIIc"
    print(s1.student_class)
    del s1.student_name
    print(s1.student_name)


if __name__ == "__main__":
    main()