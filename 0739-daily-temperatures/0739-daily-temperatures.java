class Solution {
    public int[] dailyTemperatures(int[] arr) {
     Stack <int[]> stack=new Stack<>();
        int [] answer=new int[arr.length];
        for(int i=0;i<arr.length;i++){

            while(!stack.isEmpty()&&arr[i]>stack.peek()[0]){
               answer[stack.peek()[1]]=i-stack.peek()[1] ;
               stack.pop(); 
            }
            {
                stack.add(new int[]{arr[i],i});
                
            }
            
        }
return answer;
    }
}
 // temperatures = [73,74,75,71,69,72,76,73]
 // (75,2)
 // stack=[(74,1)]
 // Output: [1,74,75,71,69,72,76,73]