import java.util.Arrays;

class Day33 {
    //Qno. 217 Contains Duplicate
    //Solution
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}