class KthLargest {
     final PriorityQueue<Integer> q;
     final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<>();
        for (int a :nums) {
            add(a);
        }
    }
    
    public int add(int val) {
        q.offer(val);
        if (q.size() > k) {
            q.poll();
        }
        return q.peek();
    }
}