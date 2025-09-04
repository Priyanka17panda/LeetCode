/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int low = 0;
        int high = n - 1;

        // First, find the peak index
        int peak = -1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        peak = low;

        // Binary search in the increasing part
        int idx = binarySearch(mountainArr, 0, peak, target, true);
        if (idx != -1) return idx;

        // Binary search in the decreasing part
        return binarySearch(mountainArr, peak + 1, n - 1, target, false);
    }

    private int binarySearch(MountainArray ma, int l, int r, int target, boolean inc) {
        while (l <= r) {
            int mid = (l + r) / 2;
            int val = ma.get(mid);
            if (val == target) return mid;
            if (inc) {
                if (val < target) l = mid + 1;
                else r = mid - 1;
            } else {
                if (val < target) r = mid - 1;
                else l = mid + 1;
            }
        }
        return -1;
    }
}