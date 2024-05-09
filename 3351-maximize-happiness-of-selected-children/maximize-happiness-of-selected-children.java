class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        for(int i=happiness.length-1;i>=0;i--){
            if(k==0)break;
            sum+=happiness[i];
            if(i>0){
                if(happiness[i-1]-(happiness.length-i)>=0){
                    
                    happiness[i-1]-=happiness.length-i;
                }
                else 
                happiness[i-1]=0;
            
            }
            k--;

        }
        return sum;
        
    }
}