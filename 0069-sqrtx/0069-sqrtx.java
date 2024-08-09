class Solution {
    public int mySqrt(int x) {
        if(x <= 1)  return x;
        long i = 1, sq = i*i;
        while(sq <= x) {
            i++;
            sq = i*i;
        }
        return (int)i-1;
    }
}