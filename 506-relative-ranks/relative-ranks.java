class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[]bucket=new int[1000000];
        int max=0;
        for(int i=0;i<score.length;i++){
            bucket[score[i]]=i+1;
            max=Math.max(max,score[i]);

        }
        String[] output=new String[score.length];
        int counter=1;
        for(int i=max+1;i>=0;i--){
            if(bucket[i]>0){
                switch(counter) {
                        case 1:
                             output[bucket[i]-1]="Gold Medal";
                             break;
                        case 2:
                             output[bucket[i]-1]="Silver Medal";
                             break;
                        case 3:
                             output[bucket[i]-1]="Bronze Medal";
                             break;
                        default:
                            output[bucket[i]-1]=String.valueOf(counter);
                }
                counter++;
            }

        }
        return output;
        
    }
}