class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!s.isEmpty() && k>0 && ch<s.peek()){
                s.pop();
                k--;
            }
            s.push(ch);
        }
        while(k>0){
          s.pop();
          k--;  
        }
        StringBuilder bl=new StringBuilder();
        for(char ch:s){
            bl.append (ch);
        }
        while(bl.length()>0 && bl.charAt(0)=='0'){
            bl.deleteCharAt(0);
        }
        if(bl.length()==0){
            return "0";
        }
        return bl.toString();
    }
}