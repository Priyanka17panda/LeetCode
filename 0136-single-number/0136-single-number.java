class Solution {
    public int singleNumber(int[] nums) {
        int answer=0;
        for (int value : nums){
            answer=answer^value;
        }
        return answer;
    }
}