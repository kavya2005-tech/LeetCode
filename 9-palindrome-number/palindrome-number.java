class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        int mod;
        while(x>0){
            mod = x % 10;
            rev = rev * 10 + mod;
            x = x/10;
        }
        if(temp == rev){
            return true;
        }
        return false;
    }
}