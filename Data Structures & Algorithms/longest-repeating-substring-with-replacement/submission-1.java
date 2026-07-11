class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int n=s.length();
        int maxfreq=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int len=0;
        while(r<n){
            char rt=s.charAt(r);
            map.put(rt,map.getOrDefault(rt,0)+1);
            maxfreq= Math.max(maxfreq,map.get(rt));

            if((r-l+1)-maxfreq>k){
                char lf=s.charAt(l);
                map.put(lf,map.get(lf)-1);
                l++;
            }
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}
