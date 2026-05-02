class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] newarr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                newarr[0] = map.get(complement);
                newarr[1] = i;
                return newarr;
            }

            map.put(nums[i], i);
        }

        return newarr;
    }
}