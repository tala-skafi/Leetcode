class Solution {
    int [] memo;
    public int minCostClimbingStairs(int[] cost) {
        memo=new int[cost.length];
        Arrays.fill(memo,-1);
        return Math.min(helper(cost, cost.length-1),helper(cost, cost.length-2));
      
    }
    public int helper(int [] cost, int i){
    if(i==0)return cost[0];
    if(i==1)return cost[1]; 
    if(memo[i]!=-1)return memo[i];

    memo[i]= Math.min(helper(cost,i-1),helper(cost,i-2))+ cost[i];
    return memo[i];
    }   
}