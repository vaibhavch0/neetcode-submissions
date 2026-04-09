class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<n;i++){
            int diff= target-numbers[i];
            if(map.containsKey(diff)){
                return new int []{map.get(diff)+1, i+1};
            }
            map.put(numbers[i],i);
        }
        return arr;
        
    }
}
