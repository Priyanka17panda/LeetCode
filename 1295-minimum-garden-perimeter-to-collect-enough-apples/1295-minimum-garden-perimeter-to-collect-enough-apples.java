class Solution {
    public long minimumPerimeter(long neededApples) {
        long low = 1, high = 100000;
        while(low<high){
            long mid=low+high>>1;
            if (2 * mid * (mid + 1) * (2 * mid + 1) >= neededApples) {
                high = mid;
            }else{
                low=mid+1;
            }
        }
        return low*8;
    }
}