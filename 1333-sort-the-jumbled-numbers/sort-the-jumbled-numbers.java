class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[] out = new int[nums.length];
        Queue<int[]> q = new PriorityQueue<>((a, b) -> {
            return (a[0] == b[0]) ? a[2] - b[2] : a[0] - b[0];
        });
        int temp=0;
        int mapped=0;
        int digit=0;
        int c=1;
        for(int i=0; i < nums.length; i++){
            temp=nums[i];
            if(temp==0)mapped=mapping[0];
            while(temp>0){
                // mapped=mapped*10;
                digit=mapping[temp%10];
                digit*=c;
                mapped+=digit;
                c*=10;
                temp=temp/10;

            }
            q.add(new int[]{mapped, nums[i],i});
            mapped=0;
            c=1;
            
        }
        int i=0;
        while(!q.isEmpty()){
            out[i++] = q.poll()[1];
            
        }
        return out;

    }
}