class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head, runner = head;
      
        /* Create a gap between the runner and the prev nodes, so that once runner reaches the end, prev.next will be the node to be removed */
        for(int i = 0; i < n; i++) {
            runner = runner.next;
        }
      
        /* If runner is null, then return head.next */
        if(runner == null) {
            return head.next;
        }
      
        /* Iterate through the list until the runner reaches the last node, prev should be at the previous node to the one that will be removed */
        while(runner.next != null) {
            runner = runner.next;
            prev = prev.next;
        }
      
        /* Set the next pointer of the prev node to the next pointer of the node that is being removed */
        prev.next = prev.next.next;
      
        return head;
    }
}
