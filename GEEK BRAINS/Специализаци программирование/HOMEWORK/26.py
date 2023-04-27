# Задача 26:  Напишите программу, которая на вход принимает два числа A и B,
# и возводит число А в целую степень B с помощью рекурсии.

# *Пример:*

# A = 3; B = 5 -> 243 (3⁵)
#     A = 2; B = 3 -> 8

import math
num = int(input('num= '))
degree = int(input('degree= '))


def num_degree(a, b):
    if b == 0:
        return 1
    elif b == 1:
        return a
    elif b != 1:
        return a*num_degree(a, b-1)


print(num_degree(num, degree))
