class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == nums[i] + 1)  i++;
            }
            if(a != nums[i])    res.add(a + "->" + nums[i]);
            else    res.add(a + "");
        }
        return res;
    }
}