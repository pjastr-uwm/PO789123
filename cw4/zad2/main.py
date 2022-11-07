from data import Address


def main():
    a1: Address = Address("Olsztyn", "10-710", 54, "Słoneczna")
    a1.show()
    a2: Address = Address("Olsztyn", "10-900", 1, "Plac JP II", 1)
    print(a1.comes_before(a2))
    print(Address.comes_before(a1, a2))


if __name__ == "__main__":
    main()
