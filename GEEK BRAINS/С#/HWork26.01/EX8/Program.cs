// Задача 8: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.

// 5 -> 2, 4
// 8 -> 2, 4, 6, 8

Console.Clear();

Console.Write("введите число ");
int N = int.Parse(Console.ReadLine());
int A=0;
while (A<N) 
{
if (A%2==0)
{
    Console.WriteLine(A);
    }
A++;
}