class Solution {
      String str;
    List<Integer>result;
    public int[] numsSameConsecDiff(int n, int k) {
       result=new ArrayList<>();
        for(int i=1;i<=9;i++){
             str ="";
            rec(i,k,n,str);
        }
      
        return result.stream().mapToInt(i -> i).toArray();
    }
    public void rec(int place,int k,int n,String str){ 
        str+=String.valueOf(place);
        if(str.length()==n){
            result.add(Integer.parseInt(str));
            str ="";
           return; 
        }
        if(k==0)rec(place+k,k,n,str);
        else {
            if(place-k>=0&&place-k<=9){
            rec(place-k,k,n,str);
        }
         if(place+k>=0&&place+k<=9){
            rec(place+k,k,n,str);
        }
        }   
    }
}