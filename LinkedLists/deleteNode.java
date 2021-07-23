class Solution {
    public void deleteNode(ListNode node) {
        /* Copy the value of the next node into the current node, and set the next pointer of the current node to the next node of the next node */
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
