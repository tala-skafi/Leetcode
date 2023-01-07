class Solution {
	public int maxAbsoluteSum(int[] arr) {
		int[] temp1 = arr.clone();
		int[] temp2 = arr.clone();

		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = -1 * temp2[i];
		}
		int max1 = Integer.MIN_VALUE;
		int sum1 = 0;
		for (int i = 0; i < temp1.length; i++) {
			sum1 += temp1[i];
			if (sum1 < 0) {
				sum1 = 0;
			}
			max1 = Math.max(max1, sum1);
		}
		int max2 = Integer.MIN_VALUE;
		int sum2 = 0;
		for (int i = 0; i < temp2.length; i++) {
			sum2 += temp2[i];
			if (sum2 < 0) {
				sum2 = 0;
			}
			max2 = Math.max(max2, sum2);
		}
		return Math.max(max1, max2);
	}
}