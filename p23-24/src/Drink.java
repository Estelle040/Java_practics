import java.util.Objects;

public final class Drink implements Item{
    private final int cost;
    private  final String name, description;

    public Drink(String name, String description) {
        if (Objects.equals(name, "") || Objects.equals(description, "")) {
            throw new IllegalArgumentException("Напиток создан неправильно");
        }
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Drink(String name, String description, int cost) {
        if (Objects.equals(name, "") || Objects.equals(description, "") || cost < 0) {
            throw new IllegalArgumentException("Напиток создан неправильно");
        }
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}
