class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
       PriorityQueue<int[]> maxHeap = new PriorityQueue<>(Comparator.comparingDouble(array -> {
            return (double) array[0] / array[1]; 
        }));
        int count =k;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                 if(count>0)maxHeap.offer(new int[]{arr[i],arr[j]});
                 else{
                    int[] temp = maxHeap.peek();
                     if ((double)arr[i]/arr[j] < temp[0]/temp[1]) {
                maxHeap.poll();
                maxHeap.offer(new int[]{arr[i],arr[j]});
            }
                 }
                

            }
        }
        int[] pair=new int[]{0,0};
           while (!maxHeap.isEmpty() &&k>0) {
             pair = maxHeap.poll();
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
            k--;
        
        }
        return pair;
        
        }


        
    
}