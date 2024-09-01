class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1)  return true;
        if(n < 1)   return false;
        if(n % 4 != 0)  return false;
        return isPowerOfFour(n / 4);
    }
}

// class Solution {
//     public boolean isPowerOfFour(int n) {
//         long i = 1;
//         while(i < n) i*=4;
//         return i==n;
//     }
// }