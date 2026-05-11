class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l1=0;
        int r=nums.length-2;
        int l2=1;
        while(l1<=r){
            if(nums[l1]==nums[l2]){
                l1=l1+2;
                l2=l2+2;
            }
            else if(nums[l1]!=nums[l2] && nums[l2]==nums[l2+1]){
                return nums[l1];
            }
            else if(nums[r]!=nums[r+1] && nums[r-1]==nums[r]){
                return nums[r+1];
            }
            else{
                return nums[l1];
            }
        }
         return nums[l1];       
    }
}