class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int count1=1;
        int n=nums.length;
        Arrays.sort(nums);
        if(n==0){
            return 0;
        }
       for(int i=0;i<n-1;i++){
        if(nums[i+1]==nums[i]){
            continue;
        }
        else if(nums[i+1]==nums[i]+1){
                count++;
                count1=Math.max(count1,count);
             
            }else{
                count=1;
            }
          
        }
        return count1;
        
    }
}
