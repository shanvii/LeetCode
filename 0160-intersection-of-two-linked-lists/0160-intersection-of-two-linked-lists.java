/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }
}

// public class Solution {
   
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode temp;

//         while (headA != null) {
//             temp = headB;
//             while (temp != null) {
//                 if (headA == temp) {
//                     return headA;
//                 }
//                 temp = temp.next;
//             }

//             headA = headA.next;
//         }

//         return null;
//     }
// }