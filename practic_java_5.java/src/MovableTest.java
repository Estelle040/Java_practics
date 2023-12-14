// Интерфейс Movable
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

// Класс MovablePoint реализует интерфейс Movable
class MovablePoint implements Movable {
    private int x;
    private int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Класс MovableCircle реализует интерфейс Movable
class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "Center: " + center.toString() + ", Radius: " + radius;
    }
}

// Класс MovableRectangle реализует интерфейс Movable
class MovableRectangle implements Movable {
    private MovablePoint topLeft;     // Верхняя левая точка
    private MovablePoint bottomRight; // Нижняя правая точка

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    // Метод для проверки, имеют ли точки одинаковую скорость
    public boolean hasSameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public String toString() {
        return "Top Left: " + topLeft.toString() + ", Bottom Right: " + bottomRight.toString();
    }
}

public class MovableTest {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1, 2, 4, 6, 2, 2);

        System.out.println("Original Rectangle:");
        System.out.println(rectangle);

        rectangle.moveUp();
        System.out.println("\nRectangle after moving up:");
        System.out.println(rectangle);

        rectangle.moveRight();
        System.out.println("\nRectangle after moving right:");
        System.out.println(rectangle);

        System.out.println("\nDoes the rectangle have the same speed for both points? " + rectangle.hasSameSpeed());
    }
}
