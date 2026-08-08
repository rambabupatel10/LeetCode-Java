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
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;      
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=reverse(l1);
        ListNode head2=reverse(l2);
        int carry=0;
        int sum=0;
        ListNode ans=new ListNode();
        while(head1 != null|| head2 != null){
            if(head1 !=null){
                sum+=head1.val;
                head1=head1.next;
            }
            if(head2 !=null){
                sum+=head2.val;
                head2=head2.next;
            }
            ans.val=sum %10;
            carry=sum / 10;
             ListNode newNode = new ListNode (carry);
             newNode.next=ans;
             ans=newNode;
             sum=carry;
        }
        if(carry==0){
            return ans.next;
        }
        return ans;

        
    }
}