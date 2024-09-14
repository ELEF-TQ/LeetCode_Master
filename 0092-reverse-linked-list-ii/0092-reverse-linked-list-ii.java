class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null) return null ;

        ListNode prev = null ;
        ListNode current = head ;

        while(left > 1) {
            prev = current ;
            current = current.next ;
            left-- ;
            right-- ;
        }

        ListNode start  = prev ;
        ListNode tail = current ;
        ListNode temp = null ;

        while(right > 0){
            temp = current.next ;
            current.next = prev ;
            prev = current ;
            current = temp ;
            right--;
        }

        if(start!=null){
            start.next = prev ;
        } else {
            head = prev ;
        }

        tail.next = current ;

        return head ;



        
    }
}