class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i:piles){
            max=Math.max(max,i);
        }
        int l=1;
        int r=max;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(check(piles,h,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    private static boolean check(int[]piles, int h,int mid){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%mid==0){
                sum+=piles[i]/mid;
            }else{
                sum+=piles[i]/mid+1;
            }
        }
        return sum<=h;
    }
}
