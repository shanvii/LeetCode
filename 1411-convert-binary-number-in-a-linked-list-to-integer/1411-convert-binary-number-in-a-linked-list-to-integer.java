/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int length = 0;
        int res = 0;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;
        while(temp != null) {
            if(temp.val == 1) {
                res += Math.pow(2, length - 1);
            }
            length--;
            temp = temp.next;
        }
        return res;
    }
}