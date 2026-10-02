class Solution {
    public String longestCommonPrefix(String[] arr) {
        String str="";
        if(arr.length==0)
        return "";
        if(arr.length==1)
        return arr[0];
        boolean present=true;
        for(int i=0;i<arr[0].length();i++) {
            int j=1;
            while(j<arr.length) {
                if(i>=arr[j].length() || arr[0].charAt(i)!=arr[j].charAt(i)) {
                    present=false;
                    break;
                }
                j++;
            }
            
            if(!present) {
               break; 
            }
            str+=arr[0].charAt(i);
        }
        return str;
    }
}