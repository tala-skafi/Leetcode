class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int min = 1, max = 0, l, r;
        for (int pile : piles) {
            max = Math.max(max, pile);
            min = Math.min(min, pile);
        }
        l = min;
        r = max;
        while(l < r){
            int mid = l + (r - l)/2;
            int hour = calculateH(mid, piles);
            if(hour>h){
                l=mid+1;


            }else{
                r=mid;

            }
            
        }
        return r;


    }
    private int calculateH(int mid, int []piles){
        int h=0;
        for(int pile:piles){
            h+=(pile/mid);
            if(pile%mid > 0)h++;
            
        }
        return h;
    }
}