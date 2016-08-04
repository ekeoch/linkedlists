package linkedlist;

/**
 * Created by Ekeocha on 8/4/2016.
 */
public class InsertAtNthPosOfLinkedList {
    Node InsertNth(Node head, int data, int position) {
        if (position == 0) {
            Node node = new Node();
            node.data = data;
            node.next = head;
            return node;
        }
        Node curr = head;
        Node prev = null;
        for (int i = 0; i < position; i++) {
            prev = curr;
            curr = curr.next;
        }
        Node node = new Node();
        node.data = data;
        prev.next = node;
        node.next = curr;
        return head;
    }
}
