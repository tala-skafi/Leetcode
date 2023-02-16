class Solution {
    public int minimumRounds(int[] tasks) {
        int rounds=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
         for (Map.Entry <Integer,Integer> set :
             map.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                               + set.getValue());
             
             int num=set.getValue();
             if(num==1)return -1;
             if(num%3==0)rounds+=num/3;
             else{
                 while(num%3!=0 && num>0){
                     num-=2;
                     rounds++;
                 }
                 rounds+=num/3;
             }
                 
        }
        return rounds;
    }
}