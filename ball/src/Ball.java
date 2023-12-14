import java.lang.*;
public class Ball {
    // Поля класса
    private String color;
    private double radius;

    // Конструктор класса
    public Ball(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    // Методы для доступа к полям
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Метод для вывода информации о мяче
    public void displayInfo() {
        System.out.println("Мяч: Цвет: " + color + ", Радиус : " + radius);
    }

}
