class Solution {
    public int maxSubArray(int[] nums) {
        int m = nums[0];
        int cm = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            cm = Math.max(cm, 0) + nums[i];
            m = Math.max(m, cm);
        }
        // Return the largest sum
        return m;
    }
}