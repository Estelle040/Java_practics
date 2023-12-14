import java.util.HashMap;

public class OrderManager {
    private final RestaurantOrder[] tableOrders;
    private final int numberOfTables;
    private HashMap<String, InternetOrder> internetOrders;

    OrderManager(int numberOfTables) {
        tableOrders = new RestaurantOrder[numberOfTables];
        this.numberOfTables = numberOfTables;
        internetOrders = new HashMap<>();
    }

    public void add(RestaurantOrder order, int tableNumber) throws OrderAlreadyAddedException {
        if (tableNumber >= numberOfTables || tableNumber < 0) {
            throw new IllegalTableNumber();
        }
        if (!(tableOrders[tableNumber] == null)) {
            throw new OrderAlreadyAddedException();
        }
        tableOrders[tableNumber] = order;
    }

    public Order getOrder(int tableNumber) {
        if (tableNumber >= numberOfTables || tableNumber < 0) {
            throw new IllegalTableNumber();
        }
        return tableOrders[tableNumber];
    }

    public void addItem(Item item, int tableNumber) {
        if (tableNumber >= numberOfTables || tableNumber < 0) {
            throw new IllegalTableNumber();
        }
        tableOrders[tableNumber].addPosition(item);
    }

    public void removeOrder(int tableNumber) {
        if (tableNumber >= numberOfTables || tableNumber < 0) {
            throw new IllegalTableNumber();
        }
        tableOrders[tableNumber] = null;
    }

    public int freeTableNumber() {
        for (int i = 0; i < numberOfTables; i++) {
            if (tableOrders[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int[] freeTableNumbers() {
        int[] tempOut = new int[numberOfTables];
        int count = 0;
        int index = 0;
        for (int i = 0; i < numberOfTables; i++) {
            if (tableOrders[i] == null) {
                tempOut[index] = i;
                index++;
                count++;
            }
        }
        int[] out = new int[count];
        for (int i = 0; i < count; i++) {
            out[i] = tempOut[i];
        }
        return out;
    }

    public RestaurantOrder[] getTableOrders() {
        return tableOrders;
    }

    public int tableOrderCostSummary() {
        int out = 0;
        for (int i = 0; i < numberOfTables; i++) {
            if (tableOrders[i] != null) {
                out += tableOrders[i].getTotalCost();
            }
        }
        return out;
    }

    public int tableDishQuantity(String dishName) {
        int out = 0;
        for (int i = 0; i < numberOfTables; i++) {
            if (tableOrders[i] != null) {
                out += tableOrders[i].getQuantity(dishName);
            }
        }
        return out;
    }

    public void add(String address, InternetOrder order) throws OrderAlreadyAddedException {
        if (internetOrders.containsKey(address)) {
            throw new OrderAlreadyAddedException();
        }
        internetOrders.put(address, order);
    }

    public InternetOrder getOrder(String address) {
        return internetOrders.get(address);
    }

    public void removeOrder(String address) {
        internetOrders.remove(address);
    }

    public void addItem(String address, Item item) {
        if (internetOrders.get(address) != null) {
            internetOrders.get(address).addPosition(item);
        }
    }

    public InternetOrder[] getInternetOrders() {
        InternetOrder[] out = new InternetOrder[internetOrders.keySet().size()];
        int index = 0;
        for (String address : internetOrders.keySet()) {
            out[index] = internetOrders.get(address);
            index++;
        }
        return out;
    }

    public int internetOrderCostSummary() {
        int out = 0;
        for (String address : internetOrders.keySet()) {
            out += internetOrders.get(address).getTotalCost();
        }
        return out;
    }

    public int internetDishQuantity(String name) {
        int out = 0;
        for (String address : internetOrders.keySet()) {
            out += internetOrders.get(address).getQuantity(name);
        }
        return out;
    }

    public void show() {
        System.out.println("Table orders:");
        for (int i = 0; i < tableOrders.length; i++) {
            if (tableOrders[i] != null) {
                System.out.print("Table " + i + ": ");
                tableOrders[i].show();
                System.out.println();
            }
            else {
                System.out.println("Table " + i + ": empty");
            }
        }
        System.out.println();
        System.out.println("Internet orders:");
        for (String address : internetOrders.keySet()) {
            System.out.print(address + ": ");
            internetOrders.get(address).show();
            System.out.println();
        }
    }
}
