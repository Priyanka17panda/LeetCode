class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int number = left; number <= right; number++) {
            if (isSelfDividing(number)) {
                result.add(number);
            }
        }
        return result;
    }
        private boolean isSelfDividing(int number) {
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || number % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;       
    }
}