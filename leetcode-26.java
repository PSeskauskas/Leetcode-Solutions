class Solution {
    public int removeDuplicates(int[] nums) {
        int numberOfDuplicates = 0;
        for(int i = 1; i < nums.length - numberOfDuplicates; i++) {
            if(nums[i] == nums[i - 1]) {
                numberOfDuplicates++;
                shift(nums, i, numberOfDuplicates);
                i--;
            }
        }
        return nums.length - numberOfDuplicates;
    }
    public static void shift(int[] nums, int index, int numberOfDuplicates) {
        for(int i = index; i < nums.length - numberOfDuplicates; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
    }
}
