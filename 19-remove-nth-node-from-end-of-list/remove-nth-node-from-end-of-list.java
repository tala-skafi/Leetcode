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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        HashMap<Integer,ListNode>  map=new HashMap<>();
        ListNode temp=head;
        int index=1;
        while(head!=null){
            map.put(index,head);
            index++;
            head=head.next;
        }
        int l=map.size();
         if(l==1)return null;
        if(map.get(l-(n))!=null)
        map.get(l-(n)).next= map.get(l-(n)+2);
       else return temp.next;
        return temp;
    }
}