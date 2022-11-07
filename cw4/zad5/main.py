from university import Student


def main():
    s1: Student = Student("Jan", "Kowalski", 23.4, 3)
    print(s1.get_name())
    s1.add_quiz(5.9)
    print(s1.get_total_score())
    print(s1.get_average_score())


if __name__ == "__main__":
    main()
