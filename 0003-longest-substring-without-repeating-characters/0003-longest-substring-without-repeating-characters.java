class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}