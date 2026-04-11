class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums);
        int sum=target;
        int i=0;
        int l=nums.length-1;
        int []arr=new int[2];
        while(i<l){
            if(nums[i]+nums[l]==target){
               return new int[]{i+1,l+1};
            }else if(nums[i]+nums[l]<target){
                i++;
            }else{
                l--;
            }
        }
        return arr;
    }
}
