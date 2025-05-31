class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftIndex = findFirst(nums, target);
        int rightIndex = findFirst(nums, target + 1);
    
        if (leftIndex == rightIndex) {
            return new int[] {-1, -1}; 
        } else {
            return new int[] {leftIndex, rightIndex - 1}; // target range found
        }
    }

    private int findFirst(int[] nums, int x) {
        int left = 0;
        int right = nums.length; 
        while (left < right) {
            int mid = (left + right) >>> 1; 
            if (nums[mid] >= x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left; 
    }
}