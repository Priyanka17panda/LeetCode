class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0; // This will hold the count of good pairs
        int[] count = new int[101]; // Array to store the frequency of numbers (since the max number is 100)
      
        for (int number : nums) {
            goodPairs += count[number]; // Add the count of the current number to the good pairs count
            count[number]++; // Increment the frequency of the current number
        }
      
        return goodPairs;
    }
}