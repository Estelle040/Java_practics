import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число для вычисления факториала: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен " + factorial);

        scanner.close();
    }
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
