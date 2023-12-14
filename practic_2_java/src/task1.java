public class task1 {
    public static void main(String[] args) {
        int[] numbers = {19, 2, 35, -4, 95};
        int sumFor = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumFor += numbers[i];
        }
        System.out.println("Сумма (цикл for): " + sumFor);

        int sumWhile = 0;
        int j = 0;
        while (j < numbers.length) {
            sumWhile += numbers[j];
            j++;
        }
        System.out.println("Сумма (цикл while): " + sumWhile);

        int sumDoWhile = 0;
        int k = 0;
        do {
            sumDoWhile += numbers[k];
            k++;
        } while (k < numbers.length);
        System.out.println("Сумма (цикл do-while): " + sumDoWhile);
    }
}
