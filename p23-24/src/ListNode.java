public class ListNode {
    ListNode prev;
    ListNode next;
    Item value;

    public ListNode(ListNode prev, ListNode next, Item value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }
}
