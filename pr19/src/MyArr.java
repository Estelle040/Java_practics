public class MyArr<E> {
    private Object[] elements;
    private int size;

    public MyArr() {
        elements = new Object[10];
        size = 0;
    }

    public void add(E el) {
        if (size >= elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[size] = el;
        size++;
    }

    public int getSize() {
        return size;
    }

    public E get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E)elements[index];
    }
}
