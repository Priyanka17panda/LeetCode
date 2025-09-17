class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int left = 0;
        int total = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            total += Math.abs(s.charAt(right) - t.charAt(right));

            while (total > maxCost) {
                total -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}