class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String str="";

        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }

        if(!s.equals(str)){
            return false;
        }
        return true;
    }
}
