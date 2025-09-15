// Last updated: 9/15/2025, 1:52:19 AM
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
 //started at 1:29 AM 9/15/2025
 //finished at 1:52 AM 9/15/2025
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ans = new ListNode(0);
        ListNode current = ans;
        while (l1 != null || l2 != null || carry != 0) {
            //if node doesnt exist its 0
            int val1 = 0;
            int val2 = 0;
            if (l1 != null) {val1 = l1.val;}
            if (l2 != null) {val2 = l2.val;}

            //doing addition
            int sum = val1 + val2 + carry;
            if (sum >= 10) {
                carry = 1;
                current.next = new ListNode(sum - 10);
            }
            else { //sum < 10
                carry = 0;
                current.next = new ListNode(sum);
            }
            current = current.next;

            //step        
            if (l1 != null) {l1 = l1.next;}
            if (l2 != null) {l2 = l2.next;}
        }
        return ans.next;
    }
}   