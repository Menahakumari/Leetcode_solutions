class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i=0; i<height.length; i++){
            int cur = height[i];
            while (!stack.isEmpty() && height[stack.peek()] < cur){
                int hi = height[stack.pop()];
                if (!stack.isEmpty()){
                    res += (Math.min(cur, height[stack.peek()])-hi) * (i-stack.peek()-1);
                }
            }
            stack.push(i);
        }
        return res;
    }
}