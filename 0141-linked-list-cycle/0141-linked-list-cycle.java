public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false ;
        }

        // using Floyd's Cycle Detection Algorithm
        ListNode slow = head ; /* tortoise */
        ListNode fast = head ; /* hare */

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;

            if(slow == fast){
                return true ;
            }
        }

        // if we reach the end
        return false ;

    }
}


/* using a hashset will take O(n) space Complexity : in worst case all the linked list will be stored in the hashset  */
        // HashSet<ListNode> nodes_set = new HashSet<>();
        // while (head != null) {
        //     if (nodes_set.contains(head)) {
        //         return true;
        //     }
        //     nodes_set.add(head);
        //     head = head.next;
        // }
        // return false;