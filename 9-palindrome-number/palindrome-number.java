class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int rev=0;

        if(x<0) {
            return false;
        }

        while(x>0) {
            int num= x % 10;
            rev= rev*10 + num;
            x = x/10;
        } 
        return original==rev;
        
    }
}