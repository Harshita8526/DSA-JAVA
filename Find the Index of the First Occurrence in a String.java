class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(needle.equals(haystack.substring(i,i+needle.length()))){
                    return i;
                }
            }
        }
        return -1;
    }
}
