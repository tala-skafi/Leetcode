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
        int sum=0;
        int next=0;
        ListNode res=new ListNode(0);
         ListNode l=res;

        while(l1!=null || l2!=null) {
            
            ListNode node= new ListNode();
            if (l1!=null)sum+=l1.val;
            if (l2!=null)sum+=l2.val;
            sum+=next;
            next=0;
            
            if(sum>9){
                node.val=sum%10;
                next=1;
                
            }
            else node.val=sum;
            sum=0;
            res.next=node;
            res=res.next;
            
            
            if (l1!=null)l1=l1.next;
            if (l2!=null)l2=l2.next;
        }
        if (next==1){
            res.next=new ListNode(1);
        }
        return l.next;
    }
}