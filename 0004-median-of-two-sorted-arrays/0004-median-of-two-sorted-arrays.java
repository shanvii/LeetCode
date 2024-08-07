class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m+n];

        int i = 0;
        for(; i < m; i++)
            merged[i] = nums1[i];

        for(; i < merged.length; i++)
            merged[i] = nums2[i-m];

        Arrays.sort(merged);

        double output = (merged.length % 2 == 0) ? (double)(merged[merged.length/2] + merged[merged.length/2 - 1]) / 2 : merged[merged.length/2];
        return output;
    }
}