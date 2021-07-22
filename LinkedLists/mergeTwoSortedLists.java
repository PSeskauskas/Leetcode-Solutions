class Solution {
    /* Recursive solution to the merge two lists problem */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) { return null; }
        if(l1 == null) { return l2; }
        else if(l2 == null) { return l1; }
        ListNode l3 = new ListNode();
        /* If l1.val is less than l2.val, then make the current node of the new list equal the value of l1 and call the method recursively with l1.next
        Else if l2.val is less than l1.val, do the same with l2.val instead of l1.val */
        if(l1.val <= l2.val) {
            l3.val = l1.val;
            l3.next = mergeTwoLists(l1.next, l2);
        } else {
            l3.val = l2.val;
            l3.next = mergeTwoLists(l1, l2.next);
        }
        return l3;
    }
}
