class Solution {
    public int heightChecker(int[] heights) {
       int[] heightToFreq = new int[101];

        for(int height : heights){
            heightToFreq[height]++;
        }

        int result = 0;
        int currHeight = 0;

        for(int i = 0 ;i < heights.length;i++){
            while(heightToFreq[currHeight] == 0){
                currHeight++;
            }

            if(heights[i] != currHeight){
                result++;
            }

            heightToFreq[currHeight]--;
        }

        return result; 
    }
}