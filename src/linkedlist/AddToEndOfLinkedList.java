package linkedlist;

/**
 * Created by Ekeocha on 8/4/2016.
 */
public class AddToEndOfLinkedList {
    public Node Insert(Node head, int data) {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node();
        curr.next.data = data;
        return head;
    }
}
