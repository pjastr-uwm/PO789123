from typing import Set, Any

a: Set[Any] = {4, "abc", 4, 9}
b: Set[Any] = {4.5, 9}
result: Set[Any] = a & b
print(result)
