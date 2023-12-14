interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class NameableTest {
    public static void main(String[] args) {
        Nameable planet = new Planet("Mars");
        Nameable animal = new Animal("Tiger");
        Nameable car = new Car("Toyota");

        System.out.println("Planet Name: " + planet.getName());
        System.out.println("Animal Name: " + animal.getName());
        System.out.println("Car Name: " + car.getName());
    }
}

