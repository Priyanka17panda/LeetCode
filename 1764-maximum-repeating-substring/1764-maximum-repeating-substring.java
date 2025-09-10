class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 1;
        while (sequence.contains(word.repeat(count))) {
            count++;
        }
        return count-1;
    }
}