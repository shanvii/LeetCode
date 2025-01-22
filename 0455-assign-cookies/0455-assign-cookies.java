class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int l1 = 0, l2 = 0;
        while(l1 < g.length && l2 < s.length)   {
            if(g[l1] <= s[l2])  {
                count++;
                l1++;
            }
            l2++;
        }
        return count;
    }
}