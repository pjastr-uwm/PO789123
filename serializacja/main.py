from point import Point
from named_point import NamedPoint
from typing import List
import pickle

def main() -> None:
    punkty: List[Point] = [Point(2,3), Point(-2,7),
                           NamedPoint(2,3,"A"), NamedPoint(6,2,"X")]
    f = open("punkty.pkl", "wb")
    pickle.dump(punkty, f)
    f.close()
    f = open("punkty.pkl", "rb")
    print(pickle.load(f))


if __name__ == '__main__':
    main()
