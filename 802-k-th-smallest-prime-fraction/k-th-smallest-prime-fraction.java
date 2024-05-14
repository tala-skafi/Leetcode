class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
       PriorityQueue<int[]> maxHeap = new PriorityQueue<>(Comparator.comparingDouble(array -> {
            return (double) array[0] / array[1]; 
        }));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                 maxHeap.offer(new int[]{arr[i],arr[j]});
            }
        }
        int[] pair=new int[]{0,0};
           while (!maxHeap.isEmpty() &&k>0) {
             pair = maxHeap.poll();
            k--;
        
        }
        return pair;
        
        }


        
    
}