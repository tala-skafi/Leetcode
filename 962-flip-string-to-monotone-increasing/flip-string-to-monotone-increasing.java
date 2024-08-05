class Solution {
    public int minFlipsMonoIncr(String s) {
        char [] arr=s.toCharArray();
        int onesCount=0, res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                onesCount++;
                
            }
            if(arr[i]=='0' && onesCount>0){
                res++;
                onesCount--;
            }
        }
        return res;
        
    }
}