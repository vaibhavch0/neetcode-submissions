class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int h=0;
        int len=0;
        int n=s.length();
        HashSet<Character>set=new HashSet<>();
        while(h<n){
            char ch=s.charAt(h);
            while(set.contains(ch)){
                char le=s.charAt(l);
                set.remove(le);
                l++;
            }
            set.add(ch);
            len=Math.max(len,h-l+1);
            h++;
        }
        return len;
    }
}
