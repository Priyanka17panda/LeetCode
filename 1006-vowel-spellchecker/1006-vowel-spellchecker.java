import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        // Set for exact matches (Case 1)
        Set<String> exactMatchSet = new HashSet<>();
        for (String word : wordlist) {
            exactMatchSet.add(word);
        }

        // Map for case-insensitive matches (Case 2)
        Map<String, String> caseInsensitiveMap = new HashMap<>();
        for (String word : wordlist) {
            String lowerCaseWord = word.toLowerCase();
            if (!caseInsensitiveMap.containsKey(lowerCaseWord)) {
                caseInsensitiveMap.put(lowerCaseWord, word);
            }
        }

        // Map for vowel-insensitive matches (Case 3)
        Map<String, String> vowelInsensitiveMap = new HashMap<>();
        for (String word : wordlist) {
            String lowerCaseVowelReplaced = replaceVowels(word.toLowerCase());
            if (!vowelInsensitiveMap.containsKey(lowerCaseVowelReplaced)) {
                vowelInsensitiveMap.put(lowerCaseVowelReplaced, word);
            }
        }

        String[] result = new String[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            // Rule 1: Exact match
            if (exactMatchSet.contains(query)) {
                result[i] = query;
                continue;
            }

            String lowerCaseQuery = query.toLowerCase();
            // Rule 2: Case-insensitive match
            if (caseInsensitiveMap.containsKey(lowerCaseQuery)) {
                result[i] = caseInsensitiveMap.get(lowerCaseQuery);
                continue;
            }

            // Rule 3: Vowel-insensitive match
            String lowerCaseVowelReplacedQuery = replaceVowels(lowerCaseQuery);
            if (vowelInsensitiveMap.containsKey(lowerCaseVowelReplacedQuery)) {
                result[i] = vowelInsensitiveMap.get(lowerCaseVowelReplacedQuery);
                continue;
            }

            // Rule 4: No match
            result[i] = "";
        }

        return result;
    }

    private String replaceVowels(String s) {
        return s.replaceAll("[aeiou]", "*");
    }
}