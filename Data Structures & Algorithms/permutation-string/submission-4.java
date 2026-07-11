class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        if(s1.length()>s2.length()) return false;
        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }

        for(int i=0;i<s1.length();i++){
            freq2[s2.charAt(i)-'a']++;
        }

        if(check(freq1,freq2)){
            return true;
        }
        int l=0;
        int r=s1.length()-1;
        while(r<s2.length()-1){
            r++;
            char lf=s2.charAt(l);
            char rt=s2.charAt(r);
            freq2[lf-'a']--;
            freq2[rt-'a']++;
            if(check(freq1,freq2)){
                return true;
            }
            l++;
            

        }
        return false;

    }
    private static boolean check(int[]f1,int[]f2){
        for(int i=0;i<f1.length;i++){
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }
}
