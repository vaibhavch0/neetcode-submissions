class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>op=new ArrayList<>();
        solve(nums,target,ans,op,0);
        return ans;
    }
    private static void solve(int []nums,int target,List<List<Integer>> ans,ArrayList<Integer>op,int i){
        if(i==nums.length){
        if(target==0){
            ans.add(new ArrayList<>(op));
        }
            return;
        }
            solve(nums,target,ans,op,i+1);
            
        if(nums[i]<=target){
            op.add(nums[i]);
            solve(nums,target-nums[i],ans,op,i);
            op.remove(op.size()-1);
        }
    }
}
