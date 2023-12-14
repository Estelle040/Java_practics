// Класс, описывающий голову человека
class Head {
    private String hairColor;
    private int numberOfEyes;

    public Head(String hairColor, int numberOfEyes) {
        this.hairColor = hairColor;
        this.numberOfEyes = numberOfEyes;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void think() {
        System.out.println("Человек думает.");
    }
}

// Класс, описывающий ногу человека
class Leg {
    private int length;

    public Leg(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void walk() {
        System.out.println("Человек идет.");
    }
}

// Класс, описывающий руку человека
class Hand {
    private int fingers;

    public Hand(int fingers) {
        this.fingers = fingers;
    }

    public int getFingers() {
        return fingers;
    }

    public void wave() {
        System.out.println("Человек машет рукой.");
    }
}

// Класс, описывающий человека
class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void performActions() {
        head.think();
        leftLeg.walk();
        rightLeg.walk();
        leftHand.wave();
        rightHand.wave();
    }
}

public class HumanTest {
    public static void main(String[] args) {
        // Создаем части тела человека
        Head head = new Head("Блонд", 2);
        Leg leftLeg = new Leg(80); // Длина ноги в см
        Leg rightLeg = new Leg(80);
        Hand leftHand = new Hand(5); // Количество пальцев на руке
        Hand rightHand = new Hand(5);

        // Создаем объект человека, используя созданные части тела
        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        // Вызываем метод для выполнения действий человека
        person.performActions();

        // Получаем и выводим свойства головы человека
        System.out.println("Цвет волос: " + head.getHairColor());
        System.out.println("Количество глаз: " + head.getNumberOfEyes());

        // Получаем и выводим свойства ноги человека
        System.out.println("Длина левой ноги: " + leftLeg.getLength() + " см");
        System.out.println("Длина правой ноги: " + rightLeg.getLength() + " см");

        // Получаем и выводим свойства руки человека
        System.out.println("Количество пальцев на левой руке: " + leftHand.getFingers());
        System.out.println("Количество пальцев на правой руке: " + rightHand.getFingers());
    }
}
