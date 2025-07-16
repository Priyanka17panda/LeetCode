class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] patternChars = pattern.split(""); // Keep as array of pattern chars
        String[] words = s.split(" ");
        if (patternChars.length != words.length) {
            return false;
        }

        Map<String, String> dictionary = new LinkedHashMap<>();
        HashSet<String> mappedWords = new HashSet<>();

        for (int i = 0; i < patternChars.length; i++) {
            String key = patternChars[i]; // pattern character as string
            String word = words[i];

            if (dictionary.containsKey(key)) {
                if (!dictionary.get(key).equals(word)) {
                    return false;
                }
            } else {
                if (mappedWords.contains(word)) {
                    return false; // this word is already mapped to another character
                }
                dictionary.put(key, word);
                mappedWords.add(word);
            }
        }

        return true;

    }
}