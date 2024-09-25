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

        // find middle of the linked List
        ListNode slow = head ;
        ListNode fast = head ;

        while(fast !=null && fast.next!=null){
            fast = fast.next.next ;
            slow = slow.next ;
        }

        // reverse seconde half
        slow = reverseList(slow);
        fast = head ;

        // compare
        while(slow !=null){
            if(slow.val != fast.val) return false ;
            slow = slow.next ;
            fast = fast.next ;
        }

        return true ;
        
    }

    public ListNode reverseList(ListNode node){
        ListNode prev = null ;
        while(node != null){
            ListNode next = node.next ;
            node.next = prev ;
            prev = node ;
            node = next ;
        }

        return prev ;

    }
}