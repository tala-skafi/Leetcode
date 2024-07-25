class Solution {
    public int[] sortArray(int[] nums) {
         if (nums == null || nums.length == 0) return new int[]{};
        mergeSort(nums, 0, nums.length - 1);
        return nums;
        
    }
     private void mergeSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        merge(nums, l, r);
    }
    private void merge(int[] nums, int l, int r) {
        int mid = l + (r - l) / 2;
        int[] tmp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;
        while (i <= mid || j <= r) {
            // if (i > mid || j <= r && nums[i] > nums[j]) {
            //     tmp[k++] = nums[j++];
            // } else {
            //     tmp[k++] = nums[i++];
            // }
            if(i > mid) {
                tmp[k++] = nums[j++];
            } else if( j > r) {
                tmp[k++] = nums[i++];
            }else if (nums[j] > nums[i]) {
                tmp[k++] = nums[i++];
            }else {
                tmp[k++] = nums[j++];
            }
        }
        System.arraycopy(tmp, 0, nums, l, k);
    }
}