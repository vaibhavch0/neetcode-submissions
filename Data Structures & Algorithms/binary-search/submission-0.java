class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int idx= solve(nums,target,0,n-1);
        return idx;
    }
    private static int solve(int[]nums,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
           return solve(nums,target,start,mid-1);
        }else{
           return solve(nums,target,mid+1,end); 
        }
    }
}
