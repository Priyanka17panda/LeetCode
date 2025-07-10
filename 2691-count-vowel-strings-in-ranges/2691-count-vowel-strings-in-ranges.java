class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};  
        boolean[] isValid = new boolean[words.length];  

        // Step 2: Create boolean array to mark valid strings  
        for (int i = 0; i < words.length; i++) {  
            char firstChar = words[i].charAt(0);  
            char lastChar = words[i].charAt(words[i].length() - 1);  
            isValid[i] = isVowel(firstChar) && isVowel(lastChar);  
        }  

        // Step 3: Create prefix sum array  
        int[] prefixSum = new int[words.length + 1];  
        for (int i = 0; i < words.length; i++) {  
            prefixSum[i + 1] = prefixSum[i] + (isValid[i] ? 1 : 0);  
        }  

        // Step 4: Answer each query  
        int[] result = new int[queries.length];  
        for (int i = 0; i < queries.length; i++) {  
            int li = queries[i][0];  
            int ri = queries[i][1];  
            result[i] = prefixSum[ri + 1] - prefixSum[li];  
        }  

        return result;  
    }  

    // Helper method to check if a character is a vowel  
    private static boolean isVowel(char c) {  
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';  
    }  

}