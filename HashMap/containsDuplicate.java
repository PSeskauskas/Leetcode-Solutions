class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> intMap = new HashMap<>();
        /* Add each element in the array as a key to the HashMap, if the key already exists, return true, because the array contains a duplicate */
        for(int i = 0; i < nums.length; i++) {
            if(!intMap.containsKey(nums[i])) {
                intMap.put(nums[i], 0);
            } else {
                return true;
            }
        }
        return false;
    }
}
