class Day14 {
    // Qno.26 Remove Duplicates from Sorted Array
    //Solution
    public int removeDuplicates(int[] nums) {
        int i=0;
        for (int j=1;j<nums.length;j++) {
            if (nums[i]!=nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
        
    }
}