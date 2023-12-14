import java.util.Objects;

public final class Dish implements Item{
    private final String name, description;
    private final int cost;

    public Dish(String name, String description) {
        if (Objects.equals(name, "") || Objects.equals(description, "")) {
            throw new IllegalArgumentException("Блюдо создано неправильно");
        }
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Dish(String name, String description, int cost) throws IllegalArgumentException{
        if (Objects.equals(name, "") || Objects.equals(description, "") || cost < 0) {
            throw new IllegalArgumentException("Блюдо создано неправильно");
        }
        this.name = name;
        this.description = description;
        this.cost = cost;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
