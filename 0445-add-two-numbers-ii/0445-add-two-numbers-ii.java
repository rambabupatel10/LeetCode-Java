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
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while(l1 != null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        int sum=0;
        ListNode ans=new ListNode();
        while(!s1.isEmpty()|| !s2.isEmpty()){
            if(!s1.isEmpty()){
                sum+=s1.peek();
                s1.pop();
            }
             if(!s2.isEmpty()){
                sum+=s2.peek();
                s2.pop();
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