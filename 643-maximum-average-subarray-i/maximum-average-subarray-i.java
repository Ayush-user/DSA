class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        double maxAvg=Integer.MIN_VALUE;
        double currentSum=0;

        for(int right=0;right<nums.length;right++) {
            currentSum+=nums[right];
            if(right-left+1==k) {
                double avg=currentSum/k;
                maxAvg=Math.max(avg,maxAvg);
                currentSum-=nums[left];
                left++;
            }
            
        }
        return maxAvg;
    }
}