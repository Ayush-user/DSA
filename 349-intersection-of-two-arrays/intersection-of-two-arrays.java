class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set=new HashSet<>();
        for(int num:nums1) {
            set.add(num);
        }

        HashSet<Integer> unique=new HashSet<>();
        for(int nums:nums2) {
            if(set.contains(nums)) {
                unique.add(nums);
            }
        }

        int[] arr=new int[unique.size()];
        int k=0;
        for(int nums:unique) {
            arr[k++]=nums;
        }

    return arr;

    
    //     int i=0;
    //     int j=0;
    //     Arrays.sort(nums1);
    //     Arrays.sort(nums2);
    //     int[] result = new int[Math.min(nums1.length, nums2.length)];
    //     int k = 0;
    //     while(i<nums1.length && j<nums2.length) {
    //         if(nums1[i]==nums2[j]) {
    //             if(k==0 || result[k-1]!=nums1[i]) {
    //             result[k]=nums1[i];
    //              k++;
    //             }
    //             i++;
    //             j++;
               
    //         } else if(nums1[i]>nums2[j]) {
    //             j++;
    //         } else {
    //             i++;
    //         }
    //     }
    // return Arrays.copyOf(result, k);
    }
}