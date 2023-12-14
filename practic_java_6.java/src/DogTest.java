// Абстрактный класс Dog
abstract class Dog {
    protected String breed;
    protected int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public abstract void bark(); // Абстрактный метод для голоса собаки

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}

// Класс GoldenRetriever представляет породу Золотистый ретривер
class GoldenRetriever extends Dog {
    private String color;

    public GoldenRetriever(String breed, int age, String color) {
        super(breed, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

// Класс Bulldog представляет породу Бульдог
class Bulldog extends Dog {
    private boolean isWrinkled;

    public Bulldog(String breed, int age, boolean isWrinkled) {
        super(breed, age);
        this.isWrinkled = isWrinkled;
    }

    public boolean isWrinkled() {
        return isWrinkled;
    }

    @Override
    public void bark() {
        System.out.println("Grrr! Woof!");
    }
}

// Класс Poodle представляет породу Пудель
class Poodle extends Dog {
    private boolean isHypoallergenic;

    public Poodle(String breed, int age, boolean isHypoallergenic) {
        super(breed, age);
        this.isHypoallergenic = isHypoallergenic;
    }

    public boolean isHypoallergenic() {
        return isHypoallergenic;
    }

    @Override
    public void bark() {
        System.out.println("Yap! Yap!");
    }
}

public class DogTest {
    public static void main(String[] args) {
        GoldenRetriever goldenRetriever = new GoldenRetriever("Golden Retriever", 3, "Golden");
        Bulldog bulldog = new Bulldog("Bulldog", 4, true);
        Poodle poodle = new Poodle("Poodle", 2, false);

        System.out.println("Golden Retriever Breed: " + goldenRetriever.getBreed());
        System.out.println("Golden Retriever Age: " + goldenRetriever.getAge());
        System.out.println("Golden Retriever Color: " + goldenRetriever.getColor());

        System.out.println("Bulldog Breed: " + bulldog.getBreed());
        System.out.println("Bulldog Age: " + bulldog.getAge());
        System.out.println("Bulldog Is Wrinkled: " + bulldog.isWrinkled());

        System.out.println("Poodle Breed: " + poodle.getBreed());
        System.out.println("Poodle Age: " + poodle.getAge());
        System.out.println("Poodle Is Hypoallergenic: " + poodle.isHypoallergenic());

        System.out.println("\nDog barks:");
        goldenRetriever.bark();
        bulldog.bark();
        poodle.bark();
    }
}
