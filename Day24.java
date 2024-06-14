class Day24 {
    //Qno. 162 Finding Peak Element
    //Solution
    public int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e) {
            int mid = s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1]) {
                if(mid>0 && nums[mid]>nums[mid-1]) {
                    return mid;
                }
            }
            if(nums[mid]<nums[mid+1]) {
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        return s;
    }
}