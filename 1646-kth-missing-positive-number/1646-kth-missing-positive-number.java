class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int currentNumber = 1;
        int arrIndex = 0;

        while (missingCount < k) {
            if (arrIndex < arr.length) {
                if (arr[arrIndex] == currentNumber) {
                    arrIndex++;
                } else {
                    missingCount++;
                }
            } else {
                missingCount++;
            }
            
            if (missingCount == k) {
                return currentNumber;
            }

            currentNumber++;
        }
        
        return currentNumber; 
    }
}