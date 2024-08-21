class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
                return new int[] {map.get(nums[i]), i};
            else
                map.put(target - nums[i], i);
        }
        return new int[] {};
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i < nums.length; i++) {
//             for(int j = i + 1; j < nums.length; j++) {
//                 if(target == nums[i] + nums[j]) {
//                     return new int[] {i,j};
//                 }
//             }
//         }
//         return new int[] {};
//     }
// }