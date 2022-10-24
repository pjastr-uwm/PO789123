from module_stats import Stat
from typing import List


def main():
    print(Stat([3.4, 2.3, 2.]).xsum())
    print(Stat([3.4, 2.3, 2.]).xmin())


if __name__ == "__main__":
    main()
