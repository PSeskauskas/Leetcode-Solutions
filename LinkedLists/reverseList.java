class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reversedList = null;
        ListNode temp = head;
        /* Add the current node to the front of the new list each time to get the reversed list */
        while(temp != null) {
            reversedList = addFirst(reversedList, temp.val);
            temp = temp.next;
        }
        return reversedList;
    }
    /* Add first method to add the given value to the front of the given list */
    public static ListNode addFirst(ListNode head, int val) {
        ListNode newNode = new ListNode(val, head);
        return newNode;
    }
}
