class Solution {
    
    /* Basic solution to the two sum problem, comparing the current Ith value with the Jth value until a match to the target is found 
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return null;
    } */
    
    /* Optimal solution to the two sum problem using a Hash map */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> search = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(search.get(target - nums[i]) != null) {
                return new int[] {search.get(target - nums[i]), i};
            } else {
                search.put(nums[i], i);
            }
        }
        return null;
    }
}
