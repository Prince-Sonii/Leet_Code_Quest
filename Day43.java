import java.util.Arrays;

class Day43 {
    //Qno. 1464 Maximum Product of Two Elements in an Array
    //Solution
    public int maxProduct(int[] nums) {
        int max = 0;
        int secondMax =0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>max) {
                secondMax = max;
                max = nums[i];
            } else if(nums[i]>secondMax) {
                secondMax = nums[i];
            }
        }
        return (max-1)*(secondMax-1);
    }
}