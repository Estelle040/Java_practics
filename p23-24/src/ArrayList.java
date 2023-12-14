public class ArrayList {
    private Item[] items;
    private int size;

    ArrayList() {
        items = new Item[10];
        size = 0;
    }

    public void add(Item item) {
        if (size >= items.length) {
            Item[] newElements = new Item[2 * items.length];
            for (int i = 0; i < items.length; i++) {
                newElements[i] = items[i];
            }
            items = newElements;
        }
        items[size] = item;
        size++;
    }

    public int getSize() {
        return size;
    }

    public Item get(int index) {
        return items[index];
    }

    public void set(int index, Item item) {
        items[index] = item;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            items[i] =items[i+1];
        }
    }

    public ArrayList copy() {
        ArrayList out = new ArrayList();
        for (int i = 0; i < size; i++) {
            out.add(this.get(i));
        }
        return out;
    }
}
