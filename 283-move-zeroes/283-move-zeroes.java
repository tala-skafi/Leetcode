class Solution {
    public void moveZeroes(int[] arr) {
            int pos=0;
            for(int i=0;i<arr.length;i++){
            if (arr[i]!=0){
            swap(pos,i,arr);
            pos++;
            }
            }
   
}
        public void swap(int one, int two, int[]arr){
    int temp=0;
    temp=arr[one];
    arr[one]=arr[two];
    arr[two]=temp;
}
}