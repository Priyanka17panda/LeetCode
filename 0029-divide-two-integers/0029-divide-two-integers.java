class Solution {
    public int divide(int dividend, int divisor) {
        /*double quo = dividend/divisor;
        double result = Math.ceil(quo);
        int myInt = (int) result;
        return myInt;*/
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Use long to handle abs values safely
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int sign = (dividend > 0) == (divisor > 0) ? 1 : -1;

        long result = 0;

        // Perform division via bit shifts
        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                a -= b << i;
                result += 1L << i;
            }
        }

        return (int) (sign * result);
    }
}