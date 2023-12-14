public class OrderAlreadyAddedException extends Exception {
    OrderAlreadyAddedException() {
        super("Такой заказ уже есть");
    }
}
