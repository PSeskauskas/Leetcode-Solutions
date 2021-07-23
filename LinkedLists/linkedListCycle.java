public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        /* Iterate through the list with a fast pointer and a slow pointer, if either of them reach null, 
        there is no cycle, else if the two pointers intersect, the list contains a cycle*/
        ListNode fast = head.next, slow = head;
        while(fast != null && slow != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
