# Задача 12: Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. Петя помогает Кате по математике.
# Он задумывает два натуральных числа X и Y (X,Y≤1000), а Катя должна их отгадать.
# Для этого Петя делает две подсказки. Он называет сумму этих чисел S и их произведение P.
# Помогите Кате отгадать задуманные Петей числа.

# import random

# x = print('x= ',random.randint(0,1001))
# y = print('y= ',random.randint(0,1001))

x = int(input('сумма '))
y = int(input('произведение '))
for i in range (x):
    for j in range (y):
         if x == i + j and y == i * j:
            print(i, j)

# x = int(input())
# y = int(input())
# for i in range(x):
#     for j in range(y):
#         if x == i + j and y == i * j:
#             print(i, j)

# list_1 = list() # создание пустого списка
# for i in range(5): # цикл выполнится 5 раз
#         n = int(input()) # пользователь вводит целое число
#         list_1.append(n) # сохранение элемента в конец списка
#         print(list_1) 