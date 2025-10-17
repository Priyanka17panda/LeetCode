class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(arr.contains(nums[i])){
                continue;
            }else{
            arr.add(nums[i]);
            }      
        }
        Collections.sort(arr, Collections.reverseOrder());
        if (arr.size() >= 3) {
            return arr.get(2);
        } else {
            return arr.get(0);
        }
    }
}