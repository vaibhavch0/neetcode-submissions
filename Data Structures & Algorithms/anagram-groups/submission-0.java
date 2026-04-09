class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list=new ArrayList<>();
        boolean[]used=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(used[i]){continue;}
            ArrayList<String>arr=new ArrayList<>();
            String s=strs[i];
            arr.add(s);
             used[i]=true;
            for(int j=i+1;j<strs.length;j++){
                String a=strs[j];
                if(!used[j]&& fre(s,a)){
                    arr.add(a);
                    used[j]=true;
                }
            }
            list.add(arr);
        }
        return list;
    }
    public boolean fre( String s,String t){
         int []freq=new int[26];
         if(s.length()!=t.length()){
            return false;
         }
         for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
         }

         for(int x: freq){
            if(x>=1){
                return false;
            }
         }
         return true;
    }
}
