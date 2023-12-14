package Task1;

public class Tester {
    public static void main(String[] args) {
        ArrayQueueModule aqm = ArrayQueueModule.getInstance();
        aqm.enqueue(1);
        aqm.enqueue(2);
        System.out.println(aqm.dequeue());
        aqm.enqueue(3);
        aqm.enqueue(4);
        aqm.enqueue(5);
        System.out.println(aqm.dequeue());
        aqm.enqueue(6);
        aqm.enqueue(7);
        aqm.enqueue(8);


        ArrayQueueADT adt = new ArrayQueueADT(aqm);
        System.out.println(adt.element());

        ArrayQueue aq = new ArrayQueue();
        System.out.println(aq.size());    }
}
