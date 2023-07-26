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
    public boolean isPalindrome(ListNode head) {
        Stack stack = new Stack<>();
        ListNode add = head;

        while (add != null) {
            stack.push(add.val);
            add = add.next;
        }

        while (head != null) {
            if (head.val != (int) stack.pop()) {
                return false;
            } else {
                head = head.next;
            }  
        }
        return true;
    }
}