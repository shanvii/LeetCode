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
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         if (head == null || head.next == null)  return true;
        
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         while(head != null) {
//             arr.add(head.val);
//             head = head.next;
//         }
//         int low = 0;
//         int high = arr.size() - 1;
//         while(low < high) {
//             if(arr.get(low) != arr.get(high))   return false;
//             low ++;
//             high --;
//         }
//         return true;
//     }
// }


class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)  return true;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = head;

        ListNode prev = null;
        while(slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        slow = prev;

        while(slow != null) {
            if(fast.val != slow.val)    return false;
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }
}