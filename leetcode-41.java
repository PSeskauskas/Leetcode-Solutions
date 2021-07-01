class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], 0);
        }
        int i = 1;
        while(true) {
            if(!map.containsKey(i)) {
                return i;
            }
            else {
                i++;
            }
        }
    }
}
