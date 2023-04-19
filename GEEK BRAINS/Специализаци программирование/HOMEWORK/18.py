# Задача 18: Требуется найти в массиве A[1..N] самый близкий по величине элемент к заданному числу X.
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве.
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

# *Пример:*

# 5
#     1 2 3 4 5
#     6
#     -> 5

from random import randint
list_A = list()
given_A = int(input('введите заданное число: '))
count = int(input('количество элементов: '))
for i in range(count):
    n = randint(1, 10)
    list_A.append(n)
diff_min = list_A[0]-given_A
if diff_min > 0:
    for i in range(1, len(list_A)):
        if list_A[i]-given_A <= diff_min:
            nearest = int(list_A[i])
if diff_min < 0:
    for i in range(1, len(list_A)):    
        if list_A[i]-given_A >= diff_min:
            nearest = int(list_A[i])
print('Ближайшее число в массиве ',list_A,'к заданному числу',given_A, '- ', nearest)
print()

