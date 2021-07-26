class Solution {
    /* Sort int array using merge sort */
    public void sortColors(int[] nums) {
        if(nums.length <= 1) {
            return;
        }
        int[] auxNums = new int[nums.length];
        sort(nums, auxNums, 0, nums.length - 1);
    }
    public void sort(int[] nums, int[] auxNums, int start, int end) {
        if(start < end) {
            int middle = start + (end - start) / 2;
            sort(nums, auxNums, start, middle);
            sort(nums, auxNums, middle + 1, end);
            merge(nums, auxNums, start, middle, end);
        }
    }
    public void merge(int[] nums, int[] auxNums, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        for (int k = 0; k <= end; k++) {
            auxNums[k] = nums[k];
        }
        for (int k = start; k <= end; k++) {
            if (i > middle) {
                nums[k] = auxNums[j++];
            } else if (j > end) {
                nums[k] = auxNums[i++];
            } else if (auxNums[j] < auxNums[i]) {
                nums[k] = auxNums[j++];
            } else {
                nums[k] = auxNums[i++];
            }
        }
    }
}
