class Solution {
    public int reverseDegree(String s) {
        int reverseDegree=0;
        for(int i=0;i<s.length();i++) {
            int diff=s.charAt(i)-(int)'a';
            int var=26-diff;
            reverseDegree+=var*(i+1);
        }
        return reverseDegree;
    }
}