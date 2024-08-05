class Solution {
    public int minimumDeletions(String s) {
        char[] arr=s.toCharArray();
        int len=s.length();
        int res=len;
        int [] a=new int[len];
        int aCount=0,bCount=0;
        for(int i=len-1;i>=0;i--){
            a[i]=aCount;
            if(arr[i]=='a')
            aCount++;
        }
        int i=0;
        for(char c:arr){
            res=Math.min(res, bCount+a[i]);
             if(c=='b')bCount++;
            i++;
        }


        return res;
    }
}