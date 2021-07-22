class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        /* Get the size of the list */
        int size = size(head);
        /* Rotate the list k % size times, k % size is used because a list rotated 5 times compared to the same list rotated 20 times would yield the same result */
        for(int i = 0; i < k % size; i++) {
            head = rotate(head);
        }
        return head;
    }
  
    /* Rotate the list once */
    public ListNode rotate(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        temp.next = head;
        head = temp;
        prev.next = null;
        return head;
    }
  
    /* Return the size of the list */
    public int size(ListNode head) {
        int i = 1;
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }
}
