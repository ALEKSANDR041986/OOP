# Задача 32: Определить индексы элементов массива (списка),
# значения которых принадлежат заданному диапазону
# (т.е. не меньше заданного минимума и не больше заданного максимума)

from random import randint
maximum = int(randint(10, 20))
print(maximum)
minimum = int(randint(1, 10))
print(minimum)
list_A = [int(i) for i in input().split()]
print(list_A)


def find_index(lst, mini, maxi):
    for i in range(len(lst)):
        if mini < lst[i] < maxi:
            print(i, '', end='')


find_index(list_A, minimum, maximum)

