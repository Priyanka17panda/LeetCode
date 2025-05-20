class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base for valid substrings

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // Push the index of '(' onto stack
                stack.push(i);
            } else {
                // Pop the last '(' index
                stack.pop();

                if (stack.isEmpty()) {
                    // No open '(' to match, mark this as base
                    stack.push(i);
                } else {
                    // Update max length
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}