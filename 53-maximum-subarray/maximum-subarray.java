class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        boolean hasPositive=false;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]>=0) {
                hasPositive=true;
                break;
            }
        }
        if(!hasPositive) {
            int lar=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++) {
                if(nums[i] > lar) {
                    lar=nums[i];
                }
            }
            return lar;
        }

        for(int i=0;i<nums.length;i++) {
            cs+=nums[i];
            if(cs<0) {
                cs=0;
            }
            if(cs>ms) {
                ms=cs;
            }

        }
        return ms;
        
    }
    
}