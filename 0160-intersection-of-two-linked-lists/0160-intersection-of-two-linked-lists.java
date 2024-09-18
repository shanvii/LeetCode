public class Solution {
   
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp;

        while (headA != null) {
            temp = headB;
            while (temp != null) {
                if (headA == temp) {
                    return headA;
                }
                temp = temp.next;
            }

            headA = headA.next;
        }

        return null;
    }
}