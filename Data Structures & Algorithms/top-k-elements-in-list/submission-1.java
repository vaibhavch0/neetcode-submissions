class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int x: nums){
        //     if(map.containsKey(x)){
        //     map.put(x,map.get(x)+1);
        //     }else{
        //         map.put(x,1);
        //     }
        // }
        // int[] res=new int[k];
        // int max= nums[0];
        // for(int x:map.values()){
        //     int a=x;
        //     if(x>max){
        //         max=a;
        //     }

        // }
        int maxVal=nums[0];
        int min=nums[0];
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
            min=Math.min(min,num);
        };
        int offset=-min;

        int freq[]= new int[maxVal-min+1];
        for(int i:nums){
            freq[i+offset]++;
        }

       
        int res[]=new int[k];
        for(int j=0;j<k;j++){
            int maxfreq=0;
            int index=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                index=i;
            }
        }
        res[j]=index-offset;
        freq[index]=0;
        }
        return res;
    }
}
