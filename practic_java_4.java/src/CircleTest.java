public class CircleTest {
    public static void main(String[] args) {
        // Создаем объект окружности
        Circle circle = new Circle(5.0);

        // Получаем и выводим радиус окружности
        System.out.println("Радиус окружности: " + circle.getRadius());

        // Вычисляем и выводим площадь окружности
        System.out.println("Площадь окружности: " + circle.calculateArea());

        // Вычисляем и выводим длину окружности
        System.out.println("Длина окружности: " + circle.calculateCircumference());

        // Изменяем радиус окружности
        circle.setRadius(7.5);

        // Получаем и выводим новое значение радиуса и обновленные значения площади и длины окружности
        System.out.println("Новый радиус окружности: " + circle.getRadius());
        System.out.println("Новая площадь окружности: " + circle.calculateArea());
        System.out.println("Новая длина окружности: " + circle.calculateCircumference());
    }
}
