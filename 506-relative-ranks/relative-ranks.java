class Solution {
    public String[] findRelativeRanks(int[] score) {
        int max=0;
        for(int i=0;i<score.length;i++){
            max=Math.max(max,score[i]);
        }
        int[]bucket=new int[max+1];
        for(int i=0;i<score.length;i++){
            bucket[score[i]]=i+1;
        }
        String[] output=new String[score.length];
        int counter=1;
        for(int i=bucket.length-1;i>=0;i--){
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