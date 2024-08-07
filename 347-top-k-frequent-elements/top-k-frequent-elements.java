class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = 
                        new PriorityQueue<>((entrySet1,entrySet2)-> entrySet2.getValue()-entrySet1.getValue());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(entry);
        }
        int[] out = new int[k];
        for(int i=0;i<k;i++){
            out[i] = pq.poll().getKey();
        }
        return out;
    }
}