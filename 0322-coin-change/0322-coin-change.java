class Solution {
    public int coinChange(int[] coins, int amount) {
        int count=0;
        int dp[]=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            dp[i]=amount+1;
        }
        for(int c=0;c<coins.length;c++){
            for(int j=coins[c];j<=amount;j++){
                if(dp[j-coins[c]]!=amount+1){
                    dp[j]=Math.min(dp[j-coins[c]]+1, dp[j]);

                }
            }
        }
        if(dp[amount]==amount+1){
            return -1;
        }
        return dp[amount];
    }
}