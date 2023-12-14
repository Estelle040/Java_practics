import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            // Запрашиваем информацию с клавиатуры
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите текст для добавления в конец файла: ");
            String additionalText = scanner.nextLine();

            // Создаем объект FileWriter с параметром true для добавления в конец файла
            FileWriter writer = new FileWriter("output.txt", true);

            // Записываем текст в конец файла
            writer.write(additionalText);
            writer.close();

            System.out.println("Текст успешно добавлен в конец файла.");
        } catch (IOException e) {
            System.err.println("Произошла ошибка при добавлении текста в файл: " + e.getMessage());
        }
    }
}
