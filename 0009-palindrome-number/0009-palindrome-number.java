class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int num=x;
        while(x>0){
            int dig=x%10;
            sum=sum*10+dig;
            x=x/10;
        }
        if(num==sum){
            return true;
        }
        return false;
    }
}