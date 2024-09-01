class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1)  return true;
        if(n < 1)   return false;
        if(n % 3 != 0)  return false;
        return isPowerOfThree(n / 3);
    }
}

// class Solution {
//     public boolean isPowerOfThree(int n) {
//         long i = 1;
//         while(i < n) i*=3;
//         return i==n;
//     }
// }