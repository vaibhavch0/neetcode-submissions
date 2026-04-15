class Solution {
    public int trap(int[] height) {
        int n=height.length;
       int []rightmax =new int[n];
       int maxr=0;
       int []leftmax= new int[n];
       int maxlt=0;
       int res=0;
       for(int i=0;i<n;i++){
          maxr=Math.max(maxr,height[i]);
          leftmax[i]=maxr;
       }
       for(int i=n-1;i>=0;i--){
          maxlt=Math.max(maxlt,height[i]);
          rightmax[i]=maxlt;
       }
       for(int i=0;i<n;i++){
        int curr=Math.min(leftmax[i],rightmax[i])-height[i];
        if(curr<0){
            curr=0;
        }
        res+=curr;
       }
       return res;
    }
}
