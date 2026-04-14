class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int h=1;
        int sum=0;
        while(h<prices.length){
            
            if(prices[l]>=prices[h] && h<prices.length){
                l=h;
            }
            int sum1=prices[h]-prices[l];
            sum=Math.max(sum,sum1);
           h++;
        }
        return sum;
    }
}
