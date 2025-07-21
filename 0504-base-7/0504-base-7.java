class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        if (num < 0) {
            return "-" + convertToBase7(-num);
        }
        StringBuilder builder = new StringBuilder();

        // Continue the process until we have completely converted the number to base 7
        while (num != 0) {
            // Append the remainder (base 7 digit) to the StringBuilder
            builder.append(num % 7);

            // Divide the number by 7 to get to the next digit
            num /= 7;
        }

        return builder.reverse().toString();
    }
}