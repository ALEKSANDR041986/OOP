def readfile(filename):
    data = [i.split() for i in open(filename, 'r', encoding='utf-8')]
    return data


def printinfo(data):
    for i in data:
        print(i)


def export():
    tel_add = str(input())
    with open('tel.txt', 'a', encoding='utf-8') as file:
        file.writelines('\n')
        file.writelines(tel_add)


def main():
    my_choice = -1
    data = readfile('tel.txt')
    while my_choice != 0:
        print('Выберите одно из действий')
        print('1 - Вывести инфо на экран')
        print('2 - Произвести экспорт данных')
        print('3 - удаление данных')
        print('4 - поиск: ')
        print('0 - Выход из программы')
        my_choice = int(input())
        operations = {0: close_file('tel.txt'), 1: printinfo(),
                      2: export, 3: deleted, 4: find_}
        operations[my_choice](data)
    print('До свидания')


if __name__ == '__main__':
    main()


def close_file(filename):
    with open(filename, 'r', encoding='UTF-8') as file:
        file.close()


def deleted(element,data):
    for i in data:
        if element==data[i]:
            data.remove(element)


def find_(element, filename):
    if list(filter(lambda x: element in x, filename)) == True:
        print(element, ' присутствует')
    else:
        print(element, ' отсутствует')
