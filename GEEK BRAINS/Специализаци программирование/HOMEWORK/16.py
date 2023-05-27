# Задача 16: Требуется вычислить, сколько раз встречается некоторое число X в массиве A[1..N].
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве.
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

# *Пример:*

# 5
#     1 2 3 4 5
#     3
#     -> 1


from random import randint
list_A = list()
a = int(0)
count = int(input('количество элементов: '))
for i in range(count):
    list_A.append(randint(1, 10))
print(list_A)
list_B =set(list_A)
print(list_B)
find_X = int(input())
for i in range(len(list_A)):
    if find_X == list_A[i]:
        a+=1
print(a)

print(list_A.count(find_X))

