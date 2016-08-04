package linkedlist;

/**
 * Created by Ekeocha on 8/4/2016.
 */
public class ReversePrintLinkedList {
    void ReversePrint(Node head) {
        if (head == null) return;
        Node next = null;
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while (prev != null) {
            System.out.println(prev.data);
            prev = prev.next;
        }
    }
}
