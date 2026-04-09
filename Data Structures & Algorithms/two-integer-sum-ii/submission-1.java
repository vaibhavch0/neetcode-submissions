class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]=new int[2];
        int left=0;
        int right=n-1;
        while(left<right){
             int sum=numbers[left]+numbers[right];

             if(sum==target){
                return new int[]{left+1, right+1};
             }
             if(sum<target){
                left++;
             }else{
                right--;
             }

        }
        return arr;
        
    }
}
