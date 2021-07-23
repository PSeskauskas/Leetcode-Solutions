class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> intStack = new Stack<>();
        /* Iterate through the list with a slow and fast node, pushing each slow node's value to the stack. */
        while(fast != null && fast.next != null) {
            intStack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        /* If fast isn't null, i.e. the slow node isn't in the middle, move the slow node*/
        if(fast != null) {
            slow = slow.next;
        }
        /* Pop each element from the stack and compare it with the remaining elements of the list, if they all match, the linked list is a palindrome, 
        else, it isn't a palindrome */
        while(slow != null) {
            if(intStack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
