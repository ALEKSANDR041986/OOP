// Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.

// 2, 3, 7 -> 7
// 44 5 78 -> 78
// 22 3 9 -> 22


Console.Clear();
Console.Write("введите число 1 ");
int A = int.Parse(Console.ReadLine());
Console.Write("введите число 2 ");
int B = int.Parse(Console.ReadLine());
Console.Write("введите число 3 ");
int C = int.Parse(Console.ReadLine());
int max=0;
if(A>B)
{
    max=A;
}
else
{
    max=B;
}
if(max<C)
{
    max=C;
}
Console.WriteLine("Максимальное значение равно "+max);