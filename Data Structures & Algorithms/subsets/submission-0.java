class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>op=new ArrayList<>();
        solve(nums,ans,0,op);
        return ans;
    }
    private static void solve(int []nums,List<List<Integer>>ans,int i,ArrayList<Integer>op){
        if(i==nums.length){
            ans.add(new ArrayList<>(op));
            return;
        }
        //not take
        solve(nums,ans,i+1,op);

        //take
         op.add(nums[i]);
        solve(nums,ans,i+1,op);
       
        op.remove(op.size()-1);
    }
}
