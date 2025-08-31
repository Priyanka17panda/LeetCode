class Solution {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        StringBuilder complementedBinary = new StringBuilder();

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                complementedBinary.append('1');
            } else {
                complementedBinary.append('0');
            }
        }
        
        return Integer.parseInt(complementedBinary.toString(), 2);
    }
}