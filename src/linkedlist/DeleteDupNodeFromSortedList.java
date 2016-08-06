package linkedlist;

/**
 * Created by Ekeocha on 8/6/2016.
 */
public class DeleteDupNodeFromSortedList {
    Node RemoveDuplicates(Node head) {
        if (head == null) return head;
        Node curr = head;
        Node prev = head;
        while (curr != null) {
            if (prev.data == curr.data) {
                prev.next = curr.next;
                curr = prev.next;
            } else {
                prev.next = curr;
                prev = curr;
                curr = curr.next;
            }
        }
        return head;

    }
}
