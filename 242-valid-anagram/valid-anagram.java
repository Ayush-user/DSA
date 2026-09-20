class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();

        boolean present = false;
        if(arr1.length!=arr2.length) 
            return false;   

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j]!=0 && arr1[i] == arr2[j]) {
                    present = true;
                    arr2[j]=0;
                    break;
                } else {
                    present = false;
                }
            }
            if (!present) {
                return false;
            }
        }
        return true;
    }

}