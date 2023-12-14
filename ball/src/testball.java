import java.lang.*;
public class testball {
    // Пример использования класса
    public static void main(String[] args) {
        Ball myBall = new Ball("Радужный", 10.0);
        myBall.displayInfo();

        // Меняем цвет и радиус мяча
        myBall.setColor("Серобуромалинновый");
        myBall.setRadius(12.5);
        myBall.displayInfo();
    }
}
