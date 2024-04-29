class Solution {
    public int maxProfit(int[] prices) {
        int j=prices.length-1;
        int max=0;
        int res=0;
        while(j>=0){
            if(prices[j]>max){
                max=prices[j];
            }
            else{
                res=Math.max(res, max-prices[j]);
            } 
            j--;
        }
     return res;
    }
}