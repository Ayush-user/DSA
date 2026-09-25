class Solution {
    public int maxVowels(String s, int k) {
        char[] arr=s.toCharArray();
        int left=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int right=0;right<arr.length;right++) {
            if(arr[right]=='a' || arr[right]=='e' || arr[right]=='i'
             || arr[right]=='o' || arr[right]=='u') {
                count++;
            }
            if(right-left+1==k) {
                max=Math.max(max,count);
                if(arr[left]=='a' || arr[left]=='e' || arr[left]=='i' ||arr[left]=='o' || arr[left]=='u' ) {
                    count--;
                }
                left++;
            }
        }
        return max;
    }
}