class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                 List<Integer>arr=new ArrayList<>();
                if(nums[i]+nums[l]+nums[r]==0){
                    arr.add(nums[i]);
                    arr.add(nums[l]);
                    arr.add(nums[r]);
                    list.add(arr);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                }else if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }else{
                    r--;
                }
            }
            // if(arr.size()!=0){
            // list.add(arr);}

        }
        return list;
    }
}
