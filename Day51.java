class Day51 {
    //Qno. 15 Three Sum
    //Solution
    /*
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int index=0;
        for(int i=0;i<nums.length;i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int start = i+1;
            int end = nums.length-1;
            int target = -1*nums[i];
            while(start<end) {
                if(nums[start]+nums[end]==target) {
                    ans.add(new ArrayList<>());
                    ans.get(index).add(nums[i]);
                    ans.get(index).add(nums[start]);
                    ans.get(index).add(nums[end]);
                    index++;
                    start++;
                    while(nums[start]==nums[start-1] && start<end) {
                        start++;
                    }
                }
                else if(nums[start]+nums[end]>target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return ans;
    }

     */
}
