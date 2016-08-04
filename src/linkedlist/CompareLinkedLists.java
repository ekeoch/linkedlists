package linkedlist;

/**
 * Created by Ekeocha on 8/4/2016.
 */
public class CompareLinkedLists {
    //Compare two linked lists A and B
    //Return 1 if they are identical and 0 if they are not.
    int CompareLists(Node headA, Node headB) {
        Node currA = headA;
        Node currB = headB;

        if (currA == null && currB == null) return 1;

        if (currA == null ^ currB == null) return 0;

        while (currA != null || currB != null) {
            if (currA == null ^ currB == null) return 0;

            if (currA.data == currB.data) {
                currA = currA.next;
                currB = currB.next;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
