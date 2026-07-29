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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummy=new ListNode(0);
       ListNode prev=dummy;
        prev.next=head;
        ListNode first=prev.next;
        ListNode secound=first.next;
        while(prev.next != null && prev.next.next != null){
            first=prev.next;
            secound=first.next;

            first.next=secound.next;
            secound.next=first;
            prev.next=secound;
            
            prev=first;
        }
        return dummy.next;
    }
}