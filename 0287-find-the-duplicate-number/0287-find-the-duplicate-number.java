class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>has=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(has.contains(nums[i])){
                return nums[i];
            }
            has.add(nums[i]);
        }
        return -1;
    }
}