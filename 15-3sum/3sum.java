class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            int j=i+1;
            int k=nums.length-1;

            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            while(j<k) {
                if(j>i+1 && nums[j]==nums[j-1]) {
                    j++;
                    continue;      
                }
                if(k<nums.length-1 && nums[k]==nums[k+1]) {
                    k--;
                    continue;      
                }
                if(nums[i]+nums[j]+nums[k]==0) {
                    List<Integer> lists=new ArrayList<>();
                    lists.add(nums[i]);
                    lists.add(nums[j]);
                    lists.add(nums[k]);
                    list.add(lists);
                    j++;
                    k--;
                } else if(nums[i]+nums[j]+nums[k]<0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return list;


        // List<List<Integer>> list=new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++) {
        //     if(i>0 && nums[i]==nums[i-1]) {
        //         continue;
        //     }
        //     for(int j=i+1;j<nums.length;j++) {
        //         if(j>i+1 && nums[j]==nums[j-1]) {
        //         continue;
        //     }
        //         for(int k=j+1;k<nums.length;k++) {
        //             if(k>j+1 && nums[k]==nums[k-1]) {
        //         continue;
        //             }
        //             if(nums[i]+nums[j]+nums[k]==0) {
        //                 List<Integer> lists=new ArrayList<>();
        //                 lists.add(nums[i]);
        //                 lists.add(nums[j]);
        //                 lists.add(nums[k]);
        //                 list.add(lists);
        //             }
        //         }
        //     }
        // }
        // return list;
    }
}