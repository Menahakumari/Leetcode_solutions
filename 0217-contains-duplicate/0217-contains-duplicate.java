class Solution {
    public boolean containsDuplicate(int[] nums) {
        int val=1;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n:nums){
            if(map.containsKey(n)){
                    map.put(n,val+1);
                    return true;
            }else{
                map.put(n,val);
            }
        }
        return false;
    }
}