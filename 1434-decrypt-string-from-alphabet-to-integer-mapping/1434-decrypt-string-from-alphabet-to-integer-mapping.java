class Solution {
    public String freqAlphabets(String s) {
        int index = 0;
        int length = s.length();
        StringBuilder result = new StringBuilder();
        while (index < length) {
            if (index + 2 < length && s.charAt(index + 2) == '#') {
                int number = Integer.parseInt(s.substring(index, index + 2));
                char character = (char) ('a' + number - 1);
                result.append(character);
                index += 3;
            } else {
                int digit = Integer.parseInt(s.substring(index, index + 1));
                char character = (char) ('a' + digit - 1);
                result.append(character);
                index++;
            }
        }
        return result.toString();
    }
}