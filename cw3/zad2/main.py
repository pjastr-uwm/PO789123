from module_coin import Coin


def main():
    c1: Coin = Coin()
    c1.throw()
    c1.name = "QWE"
    Coin.name = "XYZ"
    c2: Coin = Coin()
    print(c1.show_side())


if __name__ == "__main__":
    main()
