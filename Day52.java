import java.util.Arrays;

class Day52 {
    //Qno. 16 3Sum Closest
    //Solution
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length;i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }

            int start=i+1;
            int end = nums.length-1;

            while(start<end) {
                int total = nums[i]+nums[start]+nums[end];
                if(total==target) {
                    return total;
                }
                if(Math.abs(target-total)<Math.abs(target-ans)) {
                    ans = total;
                } 
                if(total<target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return ans; 
    }
}