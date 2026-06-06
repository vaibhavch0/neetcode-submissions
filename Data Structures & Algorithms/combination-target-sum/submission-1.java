class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer>op=new ArrayList<>();
        helper(nums,target,op,0,list);
        return list;
    }
    private static void helper(int[]nums,int target, ArrayList<Integer>op,int i,List<List<Integer>> list){
        if(i>=nums.length){
            if(target==0){
                list.add(new ArrayList<>(op));
            }
            return;
        }
        // not take
       
       
            if(nums[i]<=target){
                op.add(nums[i]);
                helper(nums,target-nums[i],op,i,list);
                op.remove(op.size()-1);
            }
                 
             helper(nums,target,op,i+1,list);
        
    }
}
