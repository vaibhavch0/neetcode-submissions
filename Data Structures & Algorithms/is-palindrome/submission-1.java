class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i=0;
        int l=s.length()-1;
        while(i<l){
            if(s.charAt(i)!=s.charAt(l)){
                return false;
            }
            i++;
            l--;
        }
        return true;
    }
}
