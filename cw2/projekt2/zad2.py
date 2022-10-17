from typing import Dict, Any

d1: Dict[str, int] = {"k1": 34, "k2": -56, "k0":-23}
## posrtowanie po kluczach
print(sorted(d1))
print(dict(sorted(d1.items())))
d1 = dict(sorted(d1.items()))
## posrtowanie po wartosciach
sort_keys=sorted(d1, key=d1.get)
d2: Dict[str, int] = {}
for elem in sort_keys:
    d2[elem] = d1[elem]

d1=d2
print(d1)