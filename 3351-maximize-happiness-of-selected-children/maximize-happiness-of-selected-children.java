class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int len=happiness.length-1;
        for(int i=0;i<k;i++){
            int number=happiness[len-i]-i;
            
            if(number>0){
                sum+=number;

                
            
            }
        }
        return sum;
        
    }
}