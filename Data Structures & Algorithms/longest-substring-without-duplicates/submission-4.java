class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
        int l=0;
        int h=0;
        int len=0;
        while(h<s.length()){
            char ch=s.charAt(h);
            while(set.contains(ch)){
                char lf=s.charAt(l);
                set.remove(lf);
                l++;
            }
            set.add(ch);
            len=Math.max(len,set.size());
            h++;
        }
        return len;
        
    }
}
