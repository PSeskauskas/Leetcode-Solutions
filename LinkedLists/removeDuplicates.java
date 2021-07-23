class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        /* If the list is empty or only contains one element then there are no duplicates to be removed */
        if(head == null || head.next == null) {
            return head;
        }
        ListNode runner = head;
        /* If the current value has a duplicate after it, set the next pointer to the node after the duplicate, and check again, else, move the runner to the next node */
        while(runner.next != null) {
            if(runner.val == runner.next.val) {
                runner.next = runner.next.next;
            } else {
                runner = runner.next;
            }
        }
        return head;
    }
}
