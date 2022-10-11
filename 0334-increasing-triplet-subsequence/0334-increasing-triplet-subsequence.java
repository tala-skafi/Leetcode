public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < min) min = num;
            else if(num < secondMin&& num>min) secondMin = num;
            else if(num > secondMin) return true;
        }
        return false;
    }
}