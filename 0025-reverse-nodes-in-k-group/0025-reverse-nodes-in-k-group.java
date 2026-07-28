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
    public ListNode reverseKGroup(ListNode head, int k) {
         if (head == null){
            return null;
         }
        ListNode curr = head;

        for (int i = 0; i < k; i++) {
            if (curr == null)
                return head;     
            curr = curr.next;
        }
        ListNode rest = reverseKGroup(curr, k);
        
        ListNode prev = rest;
        curr = head;

        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
        
    }
}