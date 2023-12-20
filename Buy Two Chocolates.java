class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int s=0;
        for(int i=0;i<prices.length-1;i++){
            s=prices[i]+prices[i+1];
            if(prices[i]+prices[i+1]<money){
                return money-s;
            }
            else if(prices[i]+prices[i+1]==money){
                return 0;
            }
        }
        return money;
    }
}
