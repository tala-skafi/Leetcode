class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode dummy = new ListNode(Integer.MAX_VALUE); 
        Stack<ListNode> stk = new Stack<ListNode>(); stk.push(dummy); 
        for (ListNode node = head; node != null; node = node.next) {
            while (stk.peek().val < node.val) stk.pop(); 
            stk.peek().next = node; 
            stk.push(node); 
        }
        return dummy.next; 
    }
}