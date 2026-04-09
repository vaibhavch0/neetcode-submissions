class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        int n=nums.length;
        if(n<3){
            return list;
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int num=nums[i];
            int right=n-1;
            int left=i+1;
            
            while(left<right){
                ArrayList<Integer>arr=new ArrayList<>();
                int sum=num+nums[left]+nums[right];
                if(sum==0){
                    arr.add(num);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                   left++;
                   right--;
                   list.add(arr);
                   while(left<right && nums[left]==nums[left-1]){
                    left++;
                   }
                   while(right>left && nums[right]==nums[right+1]){
                    right--;
                   }
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return list;
        

    }
}