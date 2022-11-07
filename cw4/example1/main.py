from people import Person


def main():
    p1: Person = Person("Jan")
    print(p1.age)
    p1.age = 9
    print(p1.age)
    p2: Person = Person("Anna")
    print(p2.age)
    Person.age = 11
    print(p1.age)
    print(p2.age)


if __name__ == "__main__":
    main()
