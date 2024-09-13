class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;    
        ListNode current = head; 

        while (current != null) {
            ListNode nextNode = current.next; // save the next
            current.next = prev;             
            prev = current;                 
            current = nextNode;             
        }

        // prev will be the new head of the reversed list
        return prev;
    }
   
    
}