class Solution {
    public int reverseBits(int number) {
        int result = 0;
       for (int i = 0; i < 32 && number != 0; i++) {
        result |= ((number & 1) << (31 - i));
        number >>>= 1;
       }
       return result;
    }
}