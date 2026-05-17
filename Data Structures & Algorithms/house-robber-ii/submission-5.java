class Solution {
    public int rob(int[] nums) {
      int end=nums.length;
        if(end==1){return nums[0];}
        int n=solve(0,end-1,nums);
        int m=solve(1,end,nums);
        return Math.max(m,n);
    }
    private static int solve(int start,int end, int[]nums){
      int len=end-start;
      if(len==1)return nums[start];
      int[]dp=new int[len];
      dp[0]=nums[start];
      dp[1]=Math.max(nums[start],nums[start+1]);
      for(int i=2;i<len;i++){
        dp[i]=Math.max(dp[i-1],dp[i-2]+nums[start+i]);
      }
      return dp[len-1];
    }
}
