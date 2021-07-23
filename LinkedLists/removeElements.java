class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        } 
        /* Use recursion to remove the elements that equal the given val */
        ListNode next = removeElements(head.next, val);
        if(head.val == val) {
            return next;
        }
        head.next = next;
        return head;
    }
}
