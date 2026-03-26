class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        // Step 1: first window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int maxSum = sum;
        
        // Step 2: sliding window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];        // add next element
            sum -= nums[i - k];    // remove first element of previous window
            
            maxSum = Math.max(maxSum, sum);
        }
        
        // Step 3: return average
        return (double) maxSum / k;
    }
}