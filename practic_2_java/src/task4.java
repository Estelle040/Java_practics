import java.util.Arrays;
import java.util.Random;
public class task4 {
    public static void main(String[] args) {
        // Создаем генератор случайных чисел
        Random random = new Random();

        // Создаем массив целых чисел и генерируем случайные значения
        int[] arr = new int[10];

        System.out.println("Исходный массив:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // Генерируем случайные числа от 0 до 99
            System.out.print(arr[i] + " ");
        }

        // Сортируем массив
        Arrays.sort(arr);

        System.out.println("\nОтсортированный массив:");

        // Выводим отсортированный массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
