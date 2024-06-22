class Day32 {
    //Qno. 169 Majority Element
    //Solution
    public int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        // we are using here moore voting algorithm
        for(int i=0;i<nums.length;i++) {
            if(count==0) {
                element = nums[i];
            }
            if(element==nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}