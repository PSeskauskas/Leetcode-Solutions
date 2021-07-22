class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> firstList = new Stack<>();
        Stack<Integer> secondList = new Stack<>();
        
        /* Adding all of the values in each linked list to the stack */
        while(l1 != null) {
            firstList.push(l1.val);
            l1 = l1.next;
        }
        
        while(l2 != null) {
            secondList.push(l2.val);
            l2 = l2.next;
        }
        
        int carry = 0;
        int total = 0;
        ListNode newList = null;
        
        /* Pop the elements from each stack and sum them to the carry and add the least significant integer of the sum to the list, and alter the carry accordingly */
        while(!firstList.empty() || !secondList.empty()) {
            if(!firstList.empty()) { total += firstList.pop(); }
            if(!secondList.empty()) { total += secondList.pop(); }
            total += carry;
            newList = new ListNode(total % 10, newList);
            carry = total / 10;
            total = 0;
        }
         
        /* If there is carry left over, add it to the front of the list */
        if(carry > 0) {
            newList = new ListNode(carry, newList);
        }
        
        return newList;
    }
}
