/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode copy = head;

        while (copy != null && copy.next != null) {
            if (copy.val == copy.next.val) {
                copy.next = copy.next.next;
            }
            else    copy = copy.next;
        }

        return head;
    }
}