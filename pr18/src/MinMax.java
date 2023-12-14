import java.util.List;

public class MinMax <T extends List<E>, E extends Comparable<E>>{
    private final T arr;

    public MinMax(T arr) {
        this.arr = arr;
    }

    public E max() {
        E maxEl = arr.get(0);
        for (E el : arr) {
            if (el.compareTo(maxEl) > 0) {
                maxEl = el;
            }
        }
        return maxEl;
    }

    public E min() {
        E minEl = arr.get(0);
        for (E el : arr) {
            if (el.compareTo(minEl) < 0) {
                minEl = el;
            }
        }
        return minEl;
    }
}
