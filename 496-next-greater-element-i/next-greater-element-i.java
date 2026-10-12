class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums=new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i]==nums2[j]) {
                    int k=j+1;
                    nums[i]=-1;
                    while(k<nums2.length) {
                        if(nums2[k]>nums2[j]) {
                            nums[i]=nums2[k];
                            break;
                        } 
                        k++;
                    }
                }
            }
        }
        return nums;
    }
}