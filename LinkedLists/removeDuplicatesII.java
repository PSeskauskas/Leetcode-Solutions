class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        /* If the list is empty or only contains one element, then there are no duplicates to be removed */
        if(head == null || head.next == null) {
            return head;
        }
        /* Define a runner node and a fakeHead node pointing to the node before the head node */
        ListNode fakeHead = new ListNode(0, head);
        ListNode runner = head, prev = fakeHead;
        /* Move the runner node until it reaches the last duplicate node and set the pointer of the prev.next to the next node of the runner to remove the duplicates */
        while(runner != null) {
            while(runner.next != null && runner.val == runner.next.val) {
                runner = runner.next;
            } if(prev.next == runner) {
                prev = prev.next;
            } else {
                prev.next = runner.next;
            }
            runner = runner.next;
        }
        return fakeHead.next;
    }
}
