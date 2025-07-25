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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        // Traverse the list and remove nodes with the target value
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node with value `val`
            } else {
                current = current.next; // Move to the next node
            }
        }

        // Return the new head of the list
        return dummy.next;

    }
}