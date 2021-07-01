/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode l3Head = l3;
        int carry = 0;
        int total = 0;
        while(l1 != null && l2 != null) {
            total = l1.val + l2.val + carry;
            l3.next = new ListNode(total % 10);
            carry = total / 10;
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        } while(l1 != null) {
            total = l1.val + carry;
            l3.next = new ListNode(total % 10);
            carry = total / 10;
            l1 = l1.next;
            l3 = l3.next;
        } while(l2 != null) {
            total = l2.val + carry;
            l3.next = new ListNode(total % 10);
            carry = total / 10;
            l2 = l2.next;
            l3 = l3.next;
        }
        if(carry==1) {
            l3.next=new ListNode(1);
        }
        return l3Head.next;
    }
}
