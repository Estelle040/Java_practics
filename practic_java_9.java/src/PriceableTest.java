interface Priceable {
    double getPrice();
}

class Laptop implements Priceable {
    private double price;

    public Laptop(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Book implements Priceable {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Fruit implements Priceable {
    private double price;

    public Fruit(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class PriceableTest {
    public static void main(String[] args) {
        Priceable laptop = new Laptop(999.99);
        Priceable book = new Book(19.99);
        Priceable fruit = new Fruit(2.49);

        System.out.println("Laptop Price: $" + laptop.getPrice());
        System.out.println("Book Price: $" + book.getPrice());
        System.out.println("Fruit Price: $" + fruit.getPrice());
    }
}
