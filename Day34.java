class Day34 {
    //Qno. 268 Missing Number
    //Solution
    public int missingNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;) {
            //here we are considering 0 as missing number
            if(nums[i]==0 &&i<nums.length) {
                ans = i+1;
                i++;
            }
            else if(nums[i]-1!=i) {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        return ans;
        
    }
}
    