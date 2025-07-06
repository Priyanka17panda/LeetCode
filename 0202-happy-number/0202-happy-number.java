class Solution {
    public boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);

        while (slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);       // Move slow pointer by one step.
            fastRunner = getNext(getNext(fastRunner)); // Move fast pointer by two steps.
        }
        return slowRunner == 1;
    }
    private int getNext(int number) {
        int sumOfSquares = 0;
        while (number > 0) {
            int digit = number % 10;               
            sumOfSquares += digit * digit;         
            number /= 10;                          
        }
        return sumOfSquares;
    }
}