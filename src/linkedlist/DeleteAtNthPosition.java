package linkedlist;

/**
 * Created by Ekeocha on 8/4/2016.
 */
public class DeleteAtNthPosition {
    Node Delete(Node head, int position) {
        if(position == 0){
            return head.next;
        }

        Node curr = head;
        Node prev = null;
        for(int i = 0; i < position; i++){
            prev = curr;
            curr = curr.next;
        }
        if(curr != null){
            prev.next = curr.next;
        }
        return head;
    }
}
