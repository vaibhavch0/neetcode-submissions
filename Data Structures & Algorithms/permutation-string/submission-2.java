class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int []freq1=new int [26];
        int []freq2=new int[26];
        int h=s1.length()-1;
        int l=0;
        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }
        for(int i=0;i<=h;i++){
            char c=s2.charAt(i);
            freq2[c-'a']++;
        }
        if(check(freq1,freq2)){
            return true;
        }
        while(h<s2.length()-1){
            h++;
            char ch=s2.charAt(h);
            char lh=s2.charAt(l);
            freq2[lh-'a']--;
            freq2[ch-'a']++;
             if(check(freq1,freq2)){
            return true;
        }
        l++;
        }
        return false;
    }
    public static boolean check(int[]f1,int[]f2){
        for(int i=0;i<f1.length;i++){
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }
}
