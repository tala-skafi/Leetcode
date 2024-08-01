class Solution {
    public int countSeniors(String[] details) {
        int counter=0;
        for (int i=0;i<details.length;i++){
            int age=getAge(details[i]);
            if(age>60)counter++;
        }
        return counter;
        
    }
    private int getAge(String s){
        return Integer.parseInt(s.substring(11,13));
    }
}