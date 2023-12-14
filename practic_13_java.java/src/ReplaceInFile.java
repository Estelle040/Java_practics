import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceInFile {
    public static void main(String[] args) {
        try {
            // Запрашиваем информацию с клавиатуры
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите информацию для замены в файле: ");
            String replacement = scanner.nextLine();

            // Создаем объект FileWriter для записи в файл
            FileWriter writer = new FileWriter("output.txt");

            // Записываем новую информацию в файл (с заменой старой информации)
            writer.write(replacement);
            writer.close();

            System.out.println("Информация успешно заменена в файле.");
        } catch (IOException e) {
            System.err.println("Произошла ошибка при замене информации в файле: " + e.getMessage());
        }
    }
}
