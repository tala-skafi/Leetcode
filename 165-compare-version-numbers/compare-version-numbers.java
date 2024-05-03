class Solution {
    public int compareVersion(String ver1, String ver2) {
        String [] v1=ver1.split("\\.");
        String [] v2= ver2.split("\\.");
        int i=0;
        while(i < v1.length || i < v2.length){
               if(i>=v2.length){
                if(getValue(v1[i])>0)
                return 1;
            }
            else if(i>=v1.length){
                if(getValue(v2[i])>0)
                return -1;

            }
            else if(getValue(v1[i])>getValue(v2[i]))
            return 1;
            else if(getValue(v1[i])<getValue(v2[i]))
            return -1;
            i++;
        }
        
        return 0;
        
    }
    private int getValue(String seg){
        return Integer.parseInt(seg);
    }
}