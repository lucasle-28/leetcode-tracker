// Last updated: 9/15/2025, 1:26:34 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) {
        this.val = val;
        }
 *     ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
        }
 * }
 */
 import java.util.Stack;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s = new Stack<>();
        int rem = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + rem;

            if (sum < 10) {
                s.push(sum);
                rem = 0;
            }
            else { // sum >= 10
                s.push(sum%10);
                rem = 1;
            }
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (rem == 1) {
            s.push(1);
        }
        ListNode tail = new ListNode(s.pop(), null);
        while (!s.empty()) {
            ListNode node = new ListNode(s.pop(), tail);
            tail = node;
        }

        return tail;
    }
}