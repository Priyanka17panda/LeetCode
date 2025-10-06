class Solution {
    public boolean canWinNim(int n) {
        while(n%4!=0){
            return true;
        }
        return false;
    }
}