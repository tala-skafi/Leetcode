class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length, col = matrix[0].length;
        int left = 0, right = row * col - 1, mid;
        while (left <= right) {
            mid = (right + left) / 2;
            int midValue = matrix[mid / col][mid % col];
            if (midValue > target) {
                right = mid - 1;
            } else if (midValue < target) {
                left = mid + 1;

            } else
                return true;
        }
        return false;

    }

}