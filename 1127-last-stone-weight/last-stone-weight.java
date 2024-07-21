class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue <Integer> q = new PriorityQueue(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++){
            q.add(stones[i]);
        }
        while(q.size()>1){
            int el1= q.poll();
            int el2 =q.poll();
            if(el1!=el2)
            q.add(el1-el2);
        }
        return q.size()==1?q.peek():0;
        
    }
}