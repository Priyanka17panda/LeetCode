class Solution {
    public double myPow(double x, int n) {
       long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N; // Convert to positive long to prevent overflow
        }

        double result = 1.0;
        while (N > 0) {
            if ((N & 1) == 1) { // If current bit is set, multiply result by x
                result *= x;
            }
            x *= x; // Square the base for next bit
            N >>= 1; // Move to the next bit
        }
        return result;
  }

}