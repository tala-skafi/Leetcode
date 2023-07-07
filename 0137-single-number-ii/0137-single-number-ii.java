class Solution {
    public int singleNumber(int[] nums) {
        //XOR + AND combinations TC:O(N)
        int ones = 0, twos=0;
        for(int curr : nums){
            ones = (ones^curr) & (~twos);
            twos = (twos^curr) & (~ones);
        }
        return ones;
        //counting Set Bits
        /*int ans=0, shift=1;
        for(int i=0; i<32; i++){
            int count = 0;
            for(int curr : nums){
                if((curr & shift)!=0){
                    count ++;
                }
            }
            if(count%3 != 0){
                ans += shift;
            }
            shift = shift<<1; // shift = 2*shift
        }
        return ans;*/
    }
}