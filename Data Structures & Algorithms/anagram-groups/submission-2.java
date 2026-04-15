class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();

        for(String s: strs){
            ArrayList<String>arr=new ArrayList<>();
            char []charr= s.toCharArray();
            Arrays.sort(charr);
            String str= new String(charr);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(s);
        }
       return new ArrayList<>(map.values());
    }
}
