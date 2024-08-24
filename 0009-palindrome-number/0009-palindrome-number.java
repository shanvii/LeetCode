class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int copy = x;
        while(copy > 0) {
            int digit = copy % 10;
            rev = rev * 10 + digit;
            copy /= 10;
        }
        return rev == x;
    }
}


// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x < 0)
//             return false;
//         String num = Integer.toString(x);
//         int i = 0;
//         int j = num.length() - 1;

//         while(i < j) {
//             if(num.charAt(i) != num.charAt(j))
//                 return false;
//             i++; j--;
//         }
//         return true;
//     }
// }