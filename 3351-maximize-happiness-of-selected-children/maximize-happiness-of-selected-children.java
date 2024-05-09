class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue <Integer> queue = new PriorityQueue<>();

        for(int n : happiness) {
            queue.offer(n);
            if(queue.size() > k) {
                queue.poll();
            }
        }
        long sum = 0;
        for(int i = k-1 ; i >= 0 ; i--) {

            int number = queue.poll() - i;
            if(number > 0) {
                sum += number;
            }

        }
        return sum;

        
    }
}