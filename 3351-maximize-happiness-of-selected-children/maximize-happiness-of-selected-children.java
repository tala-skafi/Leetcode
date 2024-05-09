class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i=happiness.length-1;
        long happy=0;
        int j=0;
        while(k>0 && i>=0){
            if(happiness[i]-j>=0){
                happy+=(happiness[i]-j);
            }
            j++;
            k--;
            i--;
        }
        
        return happy;
    }
}