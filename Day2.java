class Day2 {
    //Qno.136 Single Number
    //Solution using bit-wise operator
    static int singleNumber(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++) {
            ans=ans^nums[i];
        }
        return ans;
    }
}