# Задача 14: 
# Требуется вывести все целые степени двойки (т.е. числа вида 2k), не превосходящие числа N.


number = int(input('введите число N '))
degree = int(0)

while 2**degree<=number:
    print(2**degree, end=' ')
    degree+=1