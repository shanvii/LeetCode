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
    public ListNode removeElements(ListNode copy, int val) {
        ListNode res = new ListNode(0);
        ListNode dummy = res;

        while (copy != null) {
            if (copy.val != val) {
                res.next = copy;
                res = res.next;
            }
            copy = copy.next;
        }
        res.next = null;
        return dummy.next;
    }
}