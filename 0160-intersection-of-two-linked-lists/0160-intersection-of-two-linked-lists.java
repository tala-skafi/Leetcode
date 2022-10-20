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
public class Solution {
    int flag=0;
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode temp=headB;
       while(headA!=null){
            while (headB!=null){
                if(headA.next==headB.next ){
                    if(headA==headB){
                        return headA;
                    }
                   return headA.next;
                     }
                headB=headB.next;
            }
           
         headB=temp;  
         headA=headA.next; 
       }
        return null;
    }
}


          