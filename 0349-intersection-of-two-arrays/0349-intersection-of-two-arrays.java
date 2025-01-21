class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0, p2 = 0;
        HashSet<Integer> set = new HashSet<>();

        while(p1 < nums1.length && p2 < nums2.length) {
            if(nums1[p1] == nums2[p2])  {
                set.add(nums1[p1]);
                p1++; p2++;
            }
            else if(nums1[p1] < nums2[p2])  p1++;
            else p2++;
        }

        int[] res = new int[set.size()];
        int i = 0;
        for(int x : set)
            res[i++] = x;
        return res;
    }
}