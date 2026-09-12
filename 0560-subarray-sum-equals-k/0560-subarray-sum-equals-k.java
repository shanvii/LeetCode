class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mapFreq = new HashMap<>();
        mapFreq.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remove = prefixSum - k;
            if(mapFreq.containsKey(remove)) {
                count += mapFreq.get(remove);
            }
            mapFreq.put(prefixSum, mapFreq.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}