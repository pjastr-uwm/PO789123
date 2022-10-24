from module_coin import Coin


def main():
    c1: Coin = Coin()
    c1.throw()
    print(c1.show_side())


if __name__ == "__main__":
    main()
