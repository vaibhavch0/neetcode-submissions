class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []res=new int[nums.length];
        // for(int i=0;i<nums.length;i++){int m=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //            m*=nums[j]; 
        //         }
        //     }
        //     res[i]=m;
        // }
        int n=nums.length;
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*right;
            right*=nums[i];
        }
        return res;
    }
}  
