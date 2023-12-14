// Абстрактный класс Furniture (мебель)
abstract class Furniture {
    protected String type;
    protected double price;

    public Furniture(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public abstract void displayInfo(); // Абстрактный метод для отображения информации о мебели

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

// Класс Chair (стул) представляет стул
class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String type, double price, int numberOfLegs) {
        super(type, price);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}

// Класс Table (стол) представляет стол
class Table extends Furniture {
    private int numberOfSeats;

    public Table(String type, double price, int numberOfSeats) {
        super(type, price);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}

// Класс Sofa (диван) представляет диван
class Sofa extends Furniture {
    private int numberOfCushions;

    public Sofa(String type, double price, int numberOfCushions) {
        super(type, price);
        this.numberOfCushions = numberOfCushions;
    }

    public int getNumberOfCushions() {
        return numberOfCushions;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Number of Cushions: " + numberOfCushions);
    }
}

// Класс FurnitureShop (мебельный магазин) представляет магазин мебели
class FurnitureShop {
    private Furniture[] inventory;

    public FurnitureShop(int capacity) {
        inventory = new Furniture[capacity];
    }

    public void addFurniture(Furniture furniture, int index) {
        if (index >= 0 && index < inventory.length) {
            inventory[index] = furniture;
        } else {
            System.out.println("Invalid index. Furniture not added.");
        }
    }

    public void displayInventory() {
        System.out.println("Furniture Inventory:");
        for (Furniture furniture : inventory) {
            if (furniture != null) {
                furniture.displayInfo();
                System.out.println("-----------------------");
            }
        }
    }
}

public class FurnitureTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(5);

        Chair chair = new Chair("Wooden Chair", 50.0, 4);
        Table table = new Table("Dining Table", 150.0, 6);
        Sofa sofa = new Sofa("Leather Sofa", 300.0, 3);

        shop.addFurniture(chair, 0);
        shop.addFurniture(table, 1);
        shop.addFurniture(sofa, 2);

        shop.displayInventory();
    }
}
