class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int currentProduct=1;
        int totalCount=0;
        for(int right=0;right<nums.length;right++) {
            currentProduct*=nums[right];

            while(currentProduct>=k && left<=right) {
                // count++;
                currentProduct/=nums[left];
                left++;
            }
            totalCount+=right-left+1;
        }
        return totalCount;
    }
}