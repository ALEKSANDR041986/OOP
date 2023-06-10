// 2) Вывести все простые числа от 1 до 1000


public class hw2{
public static void main(String[] args) {
    boolean b = true;
    for (int P = 1; P <= 1000; P++) {
        for (int i = 2; i < P; i++) {
            if (P % i == 0) {
                b = false;
                break;
            }
        }
        if (b) System.out.print(P+ " ");
        else b = true;
    }
} 
}