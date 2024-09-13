public class Solution {
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> nodes_set = new HashSet<>();
        
        while (head != null) {
            if (nodes_set.contains(head)) {
                return true;
            }
            nodes_set.add(head);
            head = head.next;
        }
        
        // If we reach the end of the list, there is no cycle
        return false;
    }
}
