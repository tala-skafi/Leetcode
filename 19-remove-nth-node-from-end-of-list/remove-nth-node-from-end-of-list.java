public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode newHead = new ListNode(0);
       newHead.next = head;
       ListNode p = newHead;
       ListNode runner = newHead;
       while(n>0){
           runner = runner.next;
           n--;
       }
       while(runner.next!=null){
           runner = runner.next;
           p=p.next;
       }
       p.next = p.next.next;
       return newHead.next;
    }
    
}