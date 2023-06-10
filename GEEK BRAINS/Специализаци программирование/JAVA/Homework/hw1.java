
import java.util.Scanner;

// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class hw1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in, "cp866");
        System.out.printf("Введите число n: ");
        int nums = num.nextInt();
        System.out.printf("Your number: %d \n", nums);
        num.close();
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= nums; i++) {
            sum += i;
            fact*=i;
        }
        System.out.printf("%d\n", sum);
        System.out.printf("%d", fact);
    }
}