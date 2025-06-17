class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);  
        
        // If character is not found, return the original word  
        if (index == -1) {  
            return word;  
        }  
        
        // Get the prefix to reverse  
        String prefix = word.substring(0, index + 1);  
        
        // Reverse the prefix and concatenate with the rest of the word  
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();  
        String remainder = word.substring(index + 1);  
        
        return reversedPrefix + remainder;
    }
}