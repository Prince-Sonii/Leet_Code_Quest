class Day54 {
    //Qno. 75 Sort Colors
    //Solution
    public void sortColors(int[] nums) {
        int[] counting = new int[3];
        for(int element:nums) {
            counting[element]++;
        }
        int index=0;
        for(int i=0;i<nums.length;i++) {
            while(counting[index]==0) {
                index++;
            }
            nums[i] = index;
            counting[index]--;  
        }
    }
}