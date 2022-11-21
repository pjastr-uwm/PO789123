from university import Student


def main() -> None:
    s1: Student = Student(2334,"Jan")
    s1.student_class = "IIIc"
    print(s1.student_class)
    del s1.student_name
    # print(s1.student_name)

    ## zadanie nr 4 z czesci Niewiele trudniejsze ćwiczenia sprawdzające podstawową wiedzę
    print(type(s1)) ## nie jest to poprawna odpowiedz
    print(type(s1).__name__)
    print(s1.__class__.__name__) ## rekomendowane rozwiązanie


if __name__ == "__main__":
    main()