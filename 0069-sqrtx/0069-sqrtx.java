class Solution {
    public int mySqrt(int x) {
        if(x <= 1)  return x;

        // long i = 1, sq = i*i;
        // while(sq <= x) {
        //     i++;
        //     sq = i*i;
        // }
        // return (int)i-1;
 
        int l = 1;
        int r = x;
        while(l <= r) {
            int mid = l + (r - l)/2;
            long sq = (long) mid * mid;

            if(sq == x) return mid;
            else if(sq < x) l = mid + 1;
            else    r = mid - 1;
        }
        return r;
    }
}