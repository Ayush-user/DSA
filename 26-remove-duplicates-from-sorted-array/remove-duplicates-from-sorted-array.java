class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int[] temp = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }

        temp[j++] = nums[nums.length - 1];

        for (int k = 0; k < j; k++) {
            nums[k] = temp[k];
        }

        return j;
    }
}
