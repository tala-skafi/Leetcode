class Solution {
    public int maximumPopulation(int[][] logs) {
        int max=Integer.MIN_VALUE;
        int temp;
        int year=0;
        for(int i=1950;i<=2050;i++){
            temp=0;
            for(int j=0;j<logs.length;j++){
                if(logs[j][0]<=i &&logs[j][1]>i)temp++;
            }
            if(temp>max){
                max=temp;
                year=i;
            }
           
        }
        return year;
        }
    }
