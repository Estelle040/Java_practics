import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            // Запрашиваем информацию с клавиатуры
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите информацию для записи в файл: ");
            String input = scanner.nextLine();

            // Создаем объект FileWriter для записи в файл
            FileWriter writer = new FileWriter("output.txt");

            // Записываем информацию в файл
            writer.write(input);
            writer.close();

            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.err.println("Произошла ошибка при записи в файл: " + e.getMessage());
        }
    }
}
