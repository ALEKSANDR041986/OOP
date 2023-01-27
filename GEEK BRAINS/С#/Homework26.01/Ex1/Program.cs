//Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.
//a = 5; b = 7 -> max = 7

Console.Clear();
Console.Write("Введите число 1:");
int a = int.Parse(Console.ReadLine());
Console.Write("Введите число 2:");
int b = int.Parse(Console.ReadLine());
if (a>b)
{
    Console.WriteLine("Большее число " + a);
}
else
{
    Console.WriteLine("Большее число " + b);
}