class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest=nums[0]+nums[1]+nums[2];
        int prevDiff=Math.abs(target-closest);
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++) {
            int j=i+1;
            int k=nums.length-1;

            while(j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(target-sum);
                if(diff<prevDiff) {
                closest=sum;
                prevDiff=diff;
                }
                if(sum<target) {
                    j++;
                } else if(sum>target){
                    k--;
                } else {
                    return sum;
                }
            }
        }
        return closest;
    }
}