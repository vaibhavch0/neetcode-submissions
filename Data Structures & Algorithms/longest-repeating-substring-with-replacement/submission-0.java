class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map= new HashMap<>();
        int l=0;
        int h=0;
        int len=0;
        int maxfreq=0;
        while(h<s.length()){
            char ch= s.charAt(h);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            maxfreq=Math.max(maxfreq,map.get(ch));
            while((h-l+1)-maxfreq>k){
                char lf=s.charAt(l);
               map.put(lf,map.get(lf)-1);
               l++; 
            }
            len=Math.max(len,h-l+1);
            h++;
        }
        return len;
    }
}
