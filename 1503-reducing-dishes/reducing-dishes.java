class Solution {
    public int maxSatisfaction(int[] s) {
        int len=s.length;
        int max=0;
        Arrays.sort(s);
        int pointer=-1;
        for(int i=0;i<len;i++){
            if(s[i]>0){
                pointer=i;
                break;
            }
        }
        if(pointer==-1)return 0;
        while(pointer>-1){
            max=Math.max(max,calculateMax(pointer--,s));
        }
        return max;
        
    }
    private int calculateMax (int p, int []s){
        int sum=0, idx=1;
        while(p<s.length){
            int c= s[p]*idx;
            sum+=c;
            idx++;
            p++;
        }
        return sum;
        

    }
}