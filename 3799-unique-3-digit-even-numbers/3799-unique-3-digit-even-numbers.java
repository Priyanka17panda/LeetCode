class Solution {
    public int totalNumbers(int[] digits) {
         Set<Integer> uniqueNumbers = new HashSet<>(); // Set to store distinct numbers
        int numDigits = digits.length; // Store the length of the digits array

        for (int i = 0; i < numDigits; ++i) {
            // Skip if the current digit is odd, as we want 3-digit numbers ending in an even digit
            if (digits[i] % 2 == 1) {
                continue;
            }

            for (int j = 0; j < numDigits; ++j) {
                // Ensure the second digit isn't the same as the last digit
                if (i == j) {
                    continue;
                }

                for (int k = 0; k < numDigits; ++k) {
                    // Ensure the first digit isn't 0 (leading zeroes are not allowed),
                    // and that it's different from the other selected digits
                    if (digits[k] == 0 || k == i || k == j) {
                        continue;
                    }

                    // Form the number by placing digits in hundreds, tens, and units positions
                    int number = digits[k] * 100 + digits[j] * 10 + digits[i];
                    uniqueNumbers.add(number); // Add the number to the set
                }
            }
        }

        return uniqueNumbers.size();
    }
}