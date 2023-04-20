# Задача 22: Даны два неупорядоченных набора целых чисел (может быть, с повторениями).
# Выдать без повторений в порядке возрастания все те числа, которые встречаются в обоих наборах.
# Пользователь вводит 2 числа. n — кол-во элементов первого множества. m — кол-во элементов второго множества.
# Затем пользователь вводит сами элементы множеств.

from random import randint
n = int(input('кол-во элементов первого списка: '))
lst_1 = list()
# lst_1=[lst_1.append(randint(1,10)) for i in range (n)]
for i in range(n):
    lst_1.append(randint(1, 10))
set_1 = set(lst_1)
print('первый список - ', lst_1)
print('первое множество - ', set_1)
print()
m = int(input('кол-во элементов второго списка: '))
lst_2 = list()
for i in range(m):
    lst_2.append(randint(1, 10))
set_2 = set(lst_2)
print('второй список - ', lst_2)
print('второе множество - ', set_2)
print()
print('результат', sorted(set_1.intersection(set_2)))


# print(sorted(set(range(10)).intersection(range(10))))