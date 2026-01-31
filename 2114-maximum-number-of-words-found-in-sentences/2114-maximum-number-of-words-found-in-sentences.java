class Solution {
    public int mostWordsFound(String[] sentences) {
        int m=0;
        for(String c:sentences){
            int cl=c.split(" ").length;
            if(m<cl){
                m=cl;
            }
        }return m;
    }
}