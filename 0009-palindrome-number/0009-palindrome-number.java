class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int num = x;
        while(num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return x == rev;
    }
}