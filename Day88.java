class Day88 {
    //Qno. 136 Single Number
    //Solution
    public int singleNumber(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++) {
            ans=ans^nums[i];
        }
        return ans;
    }
}