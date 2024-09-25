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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Calculate the length of the list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: If the head needs to be removed
        if (n == length) {
            return head.next;
        }

        // Step 3: Find the node just before the one to remove
        current = head;
        for (int i = 1; i < length - n; i++) {
            current = current.next;
        }

        // Step 4: Remove the nth node from the end
        current.next = current.next.next;

        return head;
    }
}
