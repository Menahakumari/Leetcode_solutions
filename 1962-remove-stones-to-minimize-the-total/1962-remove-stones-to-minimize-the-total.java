class Solution {
    public int minStoneSum(int[] piles, int k) {
       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
       int tt=0;
       for(int n:piles){
        pq.offer(n);
        tt+=n;
       }for(int i=0;i<k;i++){
        int x=pq.poll();
        int d=x/2;
        tt-=d;
        pq.offer(x-d);
       }
       return tt;
    }
}