class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int l=nums.length-1;
        int area=0;
        while(i<l){
            int ht=Math.min(nums[i],nums[l]);
            area=Math.max(area,ht*(l-i));
            if(nums[i]<nums[l]){
                i++;
            }else{
                l--;
            }
        }
        return area;
    }
}