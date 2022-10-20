import java.util.Arrays;
class Solution {
    
    public void merge(int[] num1, int m, int[] num2, int n) {
    int p1=m-1;
    int p2=n-1;
    int last=m+n-1;
  
     while(p2>=0){
        if(p1>=0 &&num1[p1]>num2[p2]){
            num1[last]=num1[p1--];
           
        }
         else if(p1>=0&&num1[p1]==num2[p2]){
             num1[last]=num2[p2--];
             //p2--;
            
         }
         else{
              num1[last]=num2[p2--];
    
         }
             
          last--;    
     }   
         
        
    }
}