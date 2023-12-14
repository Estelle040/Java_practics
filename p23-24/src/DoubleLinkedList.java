public class DoubleLinkedList {
    private int size = 0;
    private ListNode head;
    private ListNode tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public void add(Item item) {
        ListNode newNode;
        if (head == null) {
            newNode = new ListNode(null, null, item);
            head = newNode;
            tail = newNode;
            head.prev = tail;
            tail.next = head;
        }
        else {
            newNode = new ListNode(tail, head, item);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    private ListNode getNode(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Индекс больше размера");
        }
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Индекс меньше 0");
        }
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Item get(int index) {
        return getNode(index).value;
    }

    public void set(int index, Item item) {
        getNode(index).value = item;
    }

    public void remove(int index) {
        ListNode node = getNode(index);
        node.next.prev = node.prev;
        node.prev.next = node.next;
        size--;
    }

    public DoubleLinkedList copy() {
        DoubleLinkedList out = new DoubleLinkedList();
        for (int i = 0; i < size; i++) {
            out.add(this.get(i));
        }
        return out;
    }
}
