import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        // Create a priority queue (min-heap) to store the ListNode objects
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // Add the heads of all lists to the priority queue
        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }
        
        // Dummy node to simplify the code
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Merge the lists
        while (!pq.isEmpty()) {
            // Get the ListNode with the smallest value from the priority queue
            ListNode smallest = pq.poll();
            // Append it to the merged list
            current.next = smallest;
            // Move the current pointer forward
            current = current.next;
            // If the smallest ListNode has a next node, add it back to the priority queue
            if (smallest.next != null) {
                pq.offer(smallest.next);
            }
        }
        
        // Return the merged list
        return dummy.next;
    }
}
