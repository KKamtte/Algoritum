class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        int currSum = maxSum;
        for (int i = 0; i < nums.length - k; i++) {
            int right = i + k;
            currSum -= nums[i];
            currSum += nums[right];

            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }

        return (double) maxSum / k;
    }
}