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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode Curr=head;
        ListNode Nxt=head.next;
        while(Nxt !=null){
            if(Curr.val==Nxt.val){
                Curr.next=Nxt.next;
                Nxt=Nxt.next;
            }else{
                Curr=Nxt;
                Nxt=Nxt.next;
                
            }
        }
        return head;

        
    }
}