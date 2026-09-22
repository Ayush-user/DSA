class Solution {
    public String mergeAlternately(String word1, String word2) {
         int i=0;
         int j=0;
        //  int k=0;
         String merged="";
         while(i<word1.length() && j<word2.length()) {
            merged+=word1.charAt(i);
            i++;
            merged+=word2.charAt(j);
            j++;
         }

         while(i<word1.length()) {
            merged+=word1.charAt(i);
            i++;
         }
        while(j<word2.length()) {
            merged+=word2.charAt(j);
            j++;
        }

         return merged;
    }
}