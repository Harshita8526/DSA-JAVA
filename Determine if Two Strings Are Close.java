class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) {
            return false;
        }
        if(word1.equals(word2)) {
            return true;
        }
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for(int i = 0;i<word1.length();i++) {
            arr1[word1.charAt(i) - 'a']++;
        } 
        for(int i = 0;i<word2.length();i++) {
            arr2[word2.charAt(i) - 'a']++;
        }
        for(int i = 0;i<26;i++) {
            if(arr1[i] >= 1 && arr2[i] == 0) return false;
            else if(arr2[i] >= 1 && arr1[i] == 0) return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0;i<25;i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
