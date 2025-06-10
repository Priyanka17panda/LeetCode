class Solution {
    public int searchInsert(int[] nums, int target) {
         int left = 0;  
        int right = nums.length - 1;  
        
        while (left <= right) {  
            int mid = left + (right - left) / 2; // To avoid potential overflow  
            
            if (nums[mid] == target) {  
                return mid; // Target found  
            } else if (nums[mid] < target) {  
                left = mid + 1; // Search in the right half  
            } else {  
                right = mid - 1; // Search in the left half  
            }  
        }  
        
        // If the target is not found, 'left' is the index where it can be inserted  
        return left;  
    }
}