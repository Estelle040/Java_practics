import java.util.Objects;

public class InternetOrder implements Order{
    private final DoubleLinkedList items;

    InternetOrder() {
        items = new DoubleLinkedList();
    }

    InternetOrder(Item[] order) {
        items = new DoubleLinkedList();
        for (Item item : order) {
            items.add(item);
        }
    }

    @Override
    public void addPosition(Item item) {
        items.add(item);
    }

    @Override
    public boolean removeLast(String name) {
        for (int i = items.getSize() - 1; i >= 0; i--) {
            if (Objects.equals(items.get(i).getName(), name)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String name) {
        int quantityRemoved = 0;
        for (int i = 0; i < items.getSize(); i++) {
            if (Objects.equals(items.get(i).getName(), name)) {
                items.remove(i);
                quantityRemoved++;
            }
        }
        return quantityRemoved;
    }

    @Override
    public Item[] getOrders() {
        Item[] out = new Item[items.getSize()];
        for (int i = 0; i < items.getSize(); i++) {
            out[i] = items.get(i);
        }
        return out;
    }

    @Override
    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < items.getSize(); i++) {
            totalCost += items.get(i).getCost();
        }
        return totalCost;
    }

    @Override
    public int getQuantity(String name) {
        int count = 0;
        for (int i = 0; i < items.getSize(); i++) {
            if (Objects.equals(items.get(i).getName(), name)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String[] getNames() {
        DoubleLinkedList temp = new DoubleLinkedList();
        boolean flag;
        for (int i = 0; i < items.getSize(); i++) {
            flag = true;
            Item currItem = items.get(i);
            for (int j = 0; j < temp.getSize(); j++) {
                if (Objects.equals(temp.get(j).getName(), currItem.getName())) {
                    flag = false;
                }
            }
            if (flag) {
                temp.add(currItem);
            }
        }
        String[] out = new String[temp.getSize()];
        for (int i = 0; i < temp.getSize(); i++) {
            out[i] = temp.get(i).getName();
        }
        return out;
    }

    @Override
    public int[] getExpensivePos() {
        int[] out = new int[items.getSize()];
        DoubleLinkedList tempItems = items.copy();
        int maxCost = 0;
        int indexOfMax = 0;
        for (int i = 0; i < items.getSize(); i++) {
            for (int j = 0; j < tempItems.getSize(); j++) {
                if (tempItems.get(j) != null && tempItems.get(j).getCost() > maxCost) {
                    maxCost = tempItems.get(j).getCost();
                    indexOfMax = j;
                }
            }
            out[i] = indexOfMax;
            tempItems.set(indexOfMax, null);
            maxCost = 0;
        }
        return out;
    }

    public void show() {
        for (int i = 0; i < items.getSize(); i++) {
            System.out.print(items.get(i).getName() + " ");
        }
    }
}
