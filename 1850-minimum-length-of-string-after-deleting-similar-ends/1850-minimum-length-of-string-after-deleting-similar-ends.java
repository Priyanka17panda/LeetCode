class Solution {
    public int minimumLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = sb.length() - 1;
        while (start < end && sb.charAt(start) == sb.charAt(end)) {
            final char c = s.charAt(start);
            while (start <= end && s.charAt(start) == c)
                start++;
            while (start <= end && s.charAt(end) == c)
                end--;
        }
        return end - start + 1;
    }
}