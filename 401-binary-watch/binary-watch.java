class Solution {
    int[] hArr, mArr;
    List<String> result;
    Set<String> set = new HashSet();
    int leds;

    public List<String> readBinaryWatch(int turnedOn) {
        leds = turnedOn;
        result = new ArrayList<>();
        // int h, m;
        hArr = new int[4];
        mArr = new int[6];
        // for(int i=0;i<=turnedOn;i++){
        // h=turnedOn-i;
        // m=i;
        // if(h<4 && m<6){
        // helper(h,m,0,0);

        // }
        // }
        helper(0, 0, 0, 0, 0);
        set.forEach(e-> result.add(e));
        return result;

    }

    private void helper(int hLeds, int mLeds, int hIdx, int mIdx, int curr) {
        if (hLeds > 11 || mLeds > 59 || hIdx > 4 || mIdx > 6) {
            return;
        }

        if (curr == leds) {
            String s=calculate(hLeds, mLeds); 
            set.add(s);
            // System.out.println("time " + s);
            // System.out.println("hours " + hLeds);
            // System.out.println("minues " + mLeds);
            // System.out.println(" ");

        }

            // hArr[hIdx] = 1;
            helper(hLeds + (int)Math.pow(2, hIdx), mLeds, hIdx + 1, mIdx, curr + 1);
            // hArr[hIdx] = 0;
        helper(hLeds, mLeds, hIdx + 1, mIdx, curr);

        helper(hLeds, mLeds, hIdx, mIdx + 1, curr);

            helper(hLeds, mLeds +(int)Math.pow(2, mIdx), hIdx, mIdx + 1,curr + 1);
    }

    private String calculate(int h, int m) {
        StringBuilder output = new StringBuilder();
        int hSum = 0, mSum = 0;
    
        output.append(h);
        output.append(":");
        if (m < 10)
            output.append("0");
        output.append(m);
        return output.toString();

    }
}