class Day12 {
    //Qno. 53 Maximum SubArray
    //Solution
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            maxSum=sum>maxSum?sum:maxSum;
            sum=sum<0?0:sum;    
        }
        return maxSum;
    }
}