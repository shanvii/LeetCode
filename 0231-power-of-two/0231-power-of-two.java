class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1)  return true;
        if(n < 1)   return false;
        if(n % 2 != 0)  return false;
        return isPowerOfTwo(n / 2);
    }
}

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         long i = 1;
//         while(i < n) i*=2;
//         return i==n;
//     }
// }