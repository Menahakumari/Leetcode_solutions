class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int n:stones){
            pq.offer(n);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y){
                pq.offer(x-y);
            }
       
        }
        if(pq.size()==0){
            return 0;
        }else{
            return pq.peek();
        }

    }
}