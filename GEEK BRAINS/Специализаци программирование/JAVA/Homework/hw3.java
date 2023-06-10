import java.util.Scanner;

public class hw3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("введите число 1: ");
        int num_1 = sc.nextInt();
        String vvv = sc.nextLine();
        System.out.printf("введите число 2: ");
        int num_2 = sc.nextInt();
        System.out.println("введите знак: ");
        String sign = sc.next();
        System.out.printf("1 число: %d\n", num_1);
        System.out.printf(vvv);
        System.out.printf("2 число: %d\n", num_2);
        System.out.printf("знак : %s\n", sign);
        int res = 1;
        if (sign == "+") {
            res = num_1 + num_2;
        } else if (sign == "-") {
            res = num_1 - num_2;
        } else if (sign == "*") {
            res = num_1 * num_2;
        } else if (sign == "/") {
            res = num_1 / num_2;
        } else {
            System.out.printf("Введите корректный знак  (+,-,*,/)\n");
        }
        System.out.print(res);
    }
}
