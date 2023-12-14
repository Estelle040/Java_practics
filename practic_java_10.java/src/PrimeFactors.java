import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n (> 1): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 1) {
            System.out.println("Число должно быть больше 1.");
            return;
        }

        findAndPrintPrimeFactors(n);
    }

    public static void findAndPrintPrimeFactors(int n) {
        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            int count = 0;
            while (n % divisor == 0) {
                n /= divisor;
                count++;
            }
            if (count > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.print(divisor + " ");
                    break;
                }
            }
        }
        if (n > 1) {
            System.out.print(n + " ");
        }
    }
}
