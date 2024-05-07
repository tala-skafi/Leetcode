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
    public ListNode doubleIt(ListNode head) {
        ListNode tail=reverse(head);
        ListNode temp=tail;
        int res=0,carry=0;
        while(tail!=null){
           
         res=tail.val*2;
         res+=carry;
            if(res>9){
                carry=1;
                res=res-10;
            }
            else{
               
                carry=0;
            }
             tail.val=res;
         if(tail.next==null && carry!=0){
            tail.next=new ListNode(1); 
            break;
         }
            tail=tail.next;
        }
     
        return reverse(temp);   
        
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
       
}
