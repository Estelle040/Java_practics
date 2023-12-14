public class testBool {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);
        ball.setXYSpeed(2.5, 3.0);
        System.out.println("Начальное положение: " + ball.toString());
        // Двигаем мяч
        ball.move(1.5, 2.0);
        // Выводим новое положение мяча
        System.out.println("Новое положение: " + ball.toString());
        // Изменяем координаты мяча
        ball.setXY(5.0, 7.5);
        // Выводим обновленное положение мяча
        System.out.println("Обновленное положение: " + ball.toString());
    }

}
