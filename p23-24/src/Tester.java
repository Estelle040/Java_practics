public class Tester {
    public static void main(String[] args) {
        InternetOrder intOrd1 = new InternetOrder();
        intOrd1.addPosition(new Drink("Beer", "It is a beer", 200));
        intOrd1.addPosition(new Dish("Beef", "Nice stake", 1500));
        intOrd1.addPosition(new Dish("Soup", "Has some meat and vegetables in it", 1100));
        intOrd1.addPosition(new Drink("Soda", "Just some Cola", 350));
        intOrd1.addPosition(new Dish("Beef", "Another one", 1500));

        InternetOrder intOrd2 = new InternetOrder();
        intOrd2.addPosition(new Drink("Vodka", "It is a vodka", 100));
        intOrd2.addPosition(new Dish("Beef", "Nice stake", 1500));
        intOrd2.addPosition(new Dish("Soup", "Has some meat and vegetables in it", 1100));
        intOrd2.addPosition(new Drink("Soda", "Just some Cola", 350));
        intOrd2.addPosition(new Dish("Bread", "White", 75));

        RestaurantOrder restOrd1 = new RestaurantOrder();
        restOrd1.addPosition(new Drink("Vodka", "It is a vodka", -100));
        restOrd1.addPosition(new Dish("Vodka", "It is a vodka", 100));
        restOrd1.addPosition(new Dish("Vodka", "It is a vodka", 100));
        restOrd1.addPosition(new Drink("Vodka", "It is a vodka", 100));
        restOrd1.addPosition(new Dish("Vodka", "It is a vodka", 100));

        RestaurantOrder restOrd2 = new RestaurantOrder();
        restOrd2.addPosition(new Drink("Beer", "It is a beer", 200));
        restOrd2.addPosition(new Dish("Beef", "Nice stake", 1500));
        restOrd2.addPosition(new Dish("Soup", "Has some meat and vegetables in it", 1100));
        restOrd2.addPosition(new Drink("Soda", "Just some Cola", 350));
        restOrd2.addPosition(new Dish("Beef", "Another one", 1500));

        OrderManager man = new OrderManager(2);
        try {
            man.add(restOrd1, 0);
            man.add(restOrd2, 1);
            man.add("Moscow", intOrd1);
            man.add("Belgorod", intOrd2);
        }
        catch(OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }

        man.show();
        System.out.println();
        System.out.println(man.internetDishQuantity("Vodka"));
        System.out.println(man.tableDishQuantity("Vodka"));

        System.out.println();

        man.removeOrder(0);
        man.removeOrder("Moscow");
        man.addItem("Belgorod", new Drink("Tekila", "Some worms"));
        man.addItem(new Dish("Pasta", "Nice bucket", 245), 1);

        man.show();
        System.out.println();
        System.out.println(man.freeTableNumber());
        System.out.println(man.internetOrderCostSummary());
        System.out.println(man.tableOrderCostSummary());
    }
}
