class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2);
        int c1=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                c1++;
            }
        }
        int c2=0;
         for(int i=0;i<a.length();i++){
            if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u'){
                c2++;
            }
        }
        if(c1==c2){
            return true;
        }
        else{
            return false;
        }
    }
}
