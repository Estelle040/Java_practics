public interface Order {
    void addPosition(Item item);
    boolean removeLast(String name);
    int removeAll(String name);
    Item[] getOrders();
    int getTotalCost();
    int getQuantity(String name);
    String[] getNames();
    int[] getExpensivePos();
}
