class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    int n=strs.length;
    List<List<String>>list= new ArrayList<>();
    boolean []visited= new boolean[n];
    for(int i=0;i<n;i++){
        List<String>arr=new ArrayList<>();
        if(visited[i]==true) continue;
        String s= strs[i];
        arr.add(s);
        visited[i]=true;
        for(int j=i;j<n;j++){
            String a=strs[j];
            if(!visited[j] && check(s,a)){
                visited[j]=true;
                arr.add(a);
            }
        }
        list.add(arr);
    }
    return list;
    }
    public static boolean check(String s, String a){
        if(s.length()!=a.length()){
            return false;
        }
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[a.charAt(i)-'a']--;
        }
        for(int i:freq){
            if(i>=1){
                return false;
            }
        }
        return true;
    }
}
