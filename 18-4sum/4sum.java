class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            for(int j=i+1;j<nums.length-1;j++) {
                if(j>i+1 && nums[j]==nums[j-1]) {
                    continue;
                }
                int k=j+1;
                int l=nums.length-1;
                
                while(k<l) {

                    if(k>j+1 && nums[k]==nums[k-1]) {
                    k++;
                    continue;
                }
                if(l<nums.length-1 && nums[l]==nums[l+1]) {
                    l--;
                    continue;
                }
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target) {
                        List<Integer> lists=new ArrayList<>();
                        lists.add(nums[i]);
                        lists.add(nums[j]);
                        lists.add(nums[k]);
                        lists.add(nums[l]);
                        list.add(lists);
                        k++;
                        l--;
                    } else if(sum<target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return list;
    }
}