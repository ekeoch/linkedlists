package linkedlist;

/**
 * Created by Ekeocha on 8/4/2016.
 */
public class MergeSortedLinkedLists {
    Node MergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if (headA == null){
            return headB;
        }
        if (headB == null){
            return headA;
        }
        if (headA.data < headB.data){
            headA.next = MergeLists(headA.next, headB);
            return headA;
        }
        else {
            headB.next = MergeLists(headA, headB.next);
            return headB;
        }
    }
}
