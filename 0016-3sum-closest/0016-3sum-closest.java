class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        // Initialize with the sum of the first three elements
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // Update closest if this sum is nearer to target
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum == target) {
                    return target; // exact match
                } else if (sum < target) {
                    left++;
                } else { // sum > target
                    right--;
                }
            }
        }

        return closest;
    }
}