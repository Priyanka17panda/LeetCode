class Solution {
    public long sumAndMultiply(int n) {
        String text = String.valueOf(n);
        char targetToRemove = '0';
        StringBuilder result = new StringBuilder();

        // Traverse and remove '0'
        for (char c : text.toCharArray()) {
            if (c != targetToRemove) {
                result.append(c);
            }
        }
        
        // Edge case: If there are no non-zero digits (e.g., n = 0 or n = 000)
        if (result.length() == 0) {
            return 0;
        }

        // Calculate the sum of the remaining digits
        int sum = 0;
        for (int i = 0; i < result.length(); i++) {
            sum += result.charAt(i) - '0'; // Converts char '1' to int 1
        }

        // Parse the filtered digits and multiply by the sum
        long num = Long.parseLong(result.toString());
        return num * sum;
    }
}