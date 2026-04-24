class Solution {
    public int trap(int[] height) {
        int leftmax=0;
        int rightmax=0;
        int n=height.length;
        int []l=new int[n];
        int []r=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            leftmax=Math.max(leftmax,height[i]);
            l[i]=leftmax;
        }
        for(int i=n-1;i>=0;i--){
            rightmax=Math.max(rightmax,height[i]);
            r[i]=rightmax;
        }
        for(int i=0;i<n;i++){
            count+=Math.min(l[i],r[i])-height[i];

        }
        return count;
    }
}
