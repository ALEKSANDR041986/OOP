# Задача 30:  Заполните массив элементами арифметической прогрессии.
# Её первый элемент, разность и количество элементов нужно ввести с клавиатуры.
# Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
# Каждое число вводится с новой строки.

first_num = int(input('1 элемент: '))
difference = int(input('разность: '))
quantity_num = int(input('количество: '))


def ariphmetic_prog(a, b, c):
    list_A = []
    list_A.append(a)
    for i in range(2, c):
        list_A.append(a+(i-1)*b)
    print(list_A)

ariphmetic_prog(first_num, difference, quantity_num)
