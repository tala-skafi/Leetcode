class Solution {
    public int maxProfit(int[] prices) {
        int init=prices[0];
        int len=prices.length;
        int min=init;
        int diff=0;
        for(int i=1;i<len;i++){
            if(prices[i]<min)min=prices[i];
            else if(prices[i]-min>diff)diff=prices[i]-min;
        }
return diff;
    }
}