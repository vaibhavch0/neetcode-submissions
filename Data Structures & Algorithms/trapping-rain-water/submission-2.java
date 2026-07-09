class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int max=0;
        int sum=0;
        int [] left=new int[height.length];
        int [] right=new int [n];
        for(int i=0;i<n;i++){
           max=Math.max(height[i],max);
           left[i]=max;
        }
        max=0;
        for(int i=n-1;i>=0;i--){
           max=Math.max(height[i],max);
           right[i]=max;
        }

        for(int i=0;i<n;i++){
            int water=Math.min(left[i],right[i])-height[i];
            if(water>0){
                sum+=water;
            }
            
        }
        return sum;
    }
}
