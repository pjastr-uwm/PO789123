from module_person import Person


def main():
    p1: Person = Person()
    p2: Person = Person()
    p1.name = "Jan"
    print(p1.name)


if __name__ == "__main__":
    main()

