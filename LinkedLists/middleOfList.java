class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        /* Iterate throught the list, the slow node goes through each node and the fast node skips a node with each iteration, therefore when
        the fast node reaches the end of the list, the slow node will be the middle node of the list */
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
