class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []freq = new int[20000];
        for(int i: nums){
            freq[i+1000]++;
        }
        int max=Integer.MAX_VALUE;
        boolean[] isvisited=new boolean[20000];
        int [] arr= new int[k];
        for(int i=0;i<k;i++){
            arr[i]=findk(freq,nums,max,isvisited);
            isvisited[arr[i] + 1000] = true;
            max=freq[arr[i]+1000];
        }
        return arr;
    }
    public static int findk(int[]freq,int[]arr,int max,boolean[]isvisited){
        int max1=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(!isvisited[arr[i]+1000] && freq[arr[i]+1000]>max1 && freq[arr[i]+1000]<=max){
                max1=freq[arr[i]+1000];
                idx=arr[i];
            }
        }
        return idx;
    }
}
