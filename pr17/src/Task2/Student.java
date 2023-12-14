package Task2;

import java.util.Objects;

public record Student(String name, int score) {
    public static final AscendingComparator AS_COMP = new AscendingComparator();
    public static final DescendingComparator DE_COMP = new DescendingComparator();

    public Student {
        if (Objects.equals(name, "")) {
            throw new EmptyStringException();
        }
    }

    @Override
    public String toString() {
        return "Студент{" +
                "Имя: " + name +
                ", средний балл: " + score +
                '}';
    }
}
