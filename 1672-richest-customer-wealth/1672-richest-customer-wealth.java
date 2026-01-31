class Solution {
    public int maximumWealth(int[][] accounts) {
       int r=0;
       for(int []i:accounts) {
        int sum=0;
        for(int m:i){
            sum+=m;
        }
        r=Math.max(r,sum);
       }return r;
    }
}