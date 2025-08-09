class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Integer candidate1 = null, candidate2 = null;
        int count1 = 0, count2 = 0;

        for (int x : nums) {
            if (candidate1 != null && x == candidate1) {
                count1++;
            } else if (candidate2 != null && x == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = x;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = x;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        int n = nums.length;
        int freq1 = 0, freq2 = 0;
        for (int x : nums) {
            if (candidate1 != null && x == candidate1) freq1++;
            if (candidate2 != null && x == candidate2) {
                freq2++;
            }
        }

        if (candidate1 != null && freq1 > n / 3) res.add(candidate1);
        if (candidate2 != null && (candidate1 == null || !candidate2.equals(candidate1)) && freq2 > n / 3) {
            res.add(candidate2);
        }

        return res;
    }
}