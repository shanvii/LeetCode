import java.lang.Math;

// class Solution {
//     public int reverse(int num) {
//         int rev = 0;
//         // int num = Math.abs(x);
//         while(num != 0) {
//             int digit = num % 10;

//             // overflow
//             if(rev > Integer.MAX_VALUE / 10 || ( rev == Integer.MAX_VALUE / 10 && digit > 7)) 
//                 return 0;

//             //underflow
//             if(rev < Integer.MIN_VALUE / 10 || ( rev == Integer.MIN_VALUE / 10 && digit < -8))
//                 return 0;

//             rev = rev * 10 + digit;
//             num /= 10;
//         }
        
//         return rev;
//     }
// }

class Solution {
    public int reverse(int num) {
        long rev = 0;
        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;
        return(int) rev;
    }
}