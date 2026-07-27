/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.*;
public class Solution {
    public int getLength(ListNode head) {
    int count = 0;

    while (head != null) {
        count++;
        head = head.next;
    }

    return count;
}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int lenA = getLength(headA);
        int lenB = getLength(headB);
        while(lenA > lenB){
            lenA--;
            headA=headA.next;
        }

            while(lenB > lenA){
                lenB--;
                headB=headB.next;
            } 
            while(headA != headB){
                headA=headA.next;
                headB=headB.next;

            }
            return headA;
    }
}