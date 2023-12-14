// Абстрактный класс Dish
abstract class Dish {
    protected String material;
    protected int diameter;

    public Dish(String material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    public abstract void use(); // Абстрактный метод для использования посуды

    public String getMaterial() {
        return material;
    }

    public int getDiameter() {
        return diameter;
    }
}

// Класс Plate представляет тарелку
class Plate extends Dish {
    private boolean hasRim;

    public Plate(String material, int diameter, boolean hasRim) {
        super(material, diameter);
        this.hasRim = hasRim;
    }

    public boolean hasRim() {
        return hasRim;
    }

    @Override
    public void use() {
        System.out.println("Using the plate to serve food.");
    }
}

// Класс Cup представляет чашку
class Cup extends Dish {
    private int capacity;

    public Cup(String material, int diameter, int capacity) {
        super(material, diameter);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void use() {
        System.out.println("Drinking from the cup.");
    }
}

// Класс Fork представляет вилку
class Fork extends Dish {
    private int tines;

    public Fork(String material, int diameter, int tines) {
        super(material, diameter);
        this.tines = tines;
    }

    public int getTines() {
        return tines;
    }

    @Override
    public void use() {
        System.out.println("Using the fork to eat.");
    }
}

public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Ceramic", 8, true);
        Cup cup = new Cup("Glass", 4, 250);
        Fork fork = new Fork("Metal", 7, 4);

        System.out.println("Plate Material: " + plate.getMaterial());
        System.out.println("Plate Diameter: " + plate.getDiameter());
        System.out.println("Plate Has Rim: " + plate.hasRim());

        System.out.println("Cup Material: " + cup.getMaterial());
        System.out.println("Cup Diameter: " + cup.getDiameter());
        System.out.println("Cup Capacity: " + cup.getCapacity());

        System.out.println("Fork Material: " + fork.getMaterial());
        System.out.println("Fork Diameter: " + fork.getDiameter());
        System.out.println("Fork Tines: " + fork.getTines());

        System.out.println("\nUsing the Dish objects:");
        plate.use();
        cup.use();
        fork.use();
    }
}
