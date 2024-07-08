class Day47 {
    //Qno. 1365 How Many Numbers Are Smaller Than the Current Number
    //Solution
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        for(int i=0;i<nums.length;i++) {
            arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;i++) {
            arr[i] += arr[i-1];
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                nums[i] =0;
            } else {
                nums[i] = arr[nums[i]-1];
            }
        }
        return nums;
    }
}