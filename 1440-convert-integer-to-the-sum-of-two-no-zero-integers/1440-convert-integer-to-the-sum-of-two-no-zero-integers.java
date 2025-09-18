class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) { 
            int ans = n - i;
            if (check(i) && check(ans)) {
                return new int[]{i, ans};
            }
        }
        return new int[]{}; 
    }

    public boolean check(int a) {
        while (a > 0) {
            if (a % 10 == 0) return false; 
            a /= 10;
        }
        return true;
    }
}