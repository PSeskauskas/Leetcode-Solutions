class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode l3Head = l3;
        int carry = 0;
        int total = 0;
      
        /* While both lists still have elements, add the values and carry together, append the least significant integer to the new list and alter the carry accordingly
        and move the pointers to the next nodes in the lists */
        while(l1 != null && l2 != null) {
            total = l1.val + l2.val + carry;
            l3.next = new ListNode(total % 10);
            carry = total / 10;
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        } 
      
        /* If the first list still contains elements reuse the code from the previous loop with the second lists nodes removed */
        while(l1 != null) {
            total = l1.val + carry;
            l3.next = new ListNode(total % 10);
            carry = total / 10;
            l1 = l1.next;
            l3 = l3.next;
        }
        
        /* If the second list still contains elements reuse the code from the first loop with the first lists nodes removed */
        while(l2 != null) {
            total = l2.val + carry;
            l3.next = new ListNode(total % 10);
            carry = total / 10;
            l2 = l2.next;
            l3 = l3.next;
        }
      
        /* If there is carry left over, append it to the end of the list */
        if(carry==1) { l3.next=new ListNode(1); }
      
        /* Return the sum of the two lists */
        return l3Head.next;
    }
}
