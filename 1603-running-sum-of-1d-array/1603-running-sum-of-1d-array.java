class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];        // Add current element to sum
            result[i] = sum;       // Store the running sum
        }
        return result;  
    }
}