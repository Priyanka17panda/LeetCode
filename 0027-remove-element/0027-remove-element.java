class Solution {
    public int removeElement(int[] nums, int val) {
        int writeIndex = 0; // Tracks the position to write the next valid number
        for (int readIndex = 0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != val) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        return writeIndex; // Number of valid elements
    }
}