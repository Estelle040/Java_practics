public class Calculator {
    public static <T extends Number> double add(T o1, T o2) {
        return o1.doubleValue() + o2.doubleValue();
    }

    public static <T extends Number> double sub(T o1, T o2) {
        return o1.doubleValue() - o2.doubleValue();
    }

    public static <T extends Number> double mul(T o1, T o2) {
        return o1.doubleValue() * o2.doubleValue();
    }

    public static <T extends Number> double div(T o1, T o2) {
        return o1.doubleValue() / o2.doubleValue();
    }
}
