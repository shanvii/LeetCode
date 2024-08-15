class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(num.contains(nums[i]))
                return true;
            num.add(nums[i]);
        }
        return false;
    }
}

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i = 0; i < nums.length-1; i++) {
//             if(nums[i] == nums[i+1])    return true;
//         }
//         return false;
//     }
// }