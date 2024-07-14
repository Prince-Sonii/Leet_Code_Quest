class Day53 {
    //Qno. 18 4Sum
    //Solution
    /*
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int index=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            for(int j=i+1;j<nums.length;j++) {
                if(j>i+1 && nums[j]==nums[j-1]) {
                    continue;
                }
                int start = j+1;
                int end = nums.length-1;
                while(start<end) {
                    long sum = ((long)nums[i])+((long)nums[j])+((long)nums[start])+((long)nums[end]);
                    if(sum==target) {
                        ans.add(new ArrayList<>());
                        ans.get(index).add(nums[i]);
                        ans.get(index).add(nums[j]);
                        ans.get(index).add(nums[start]);
                        ans.get(index).add(nums[end]);
                        index++;
                        start++;
                        while(nums[start]==nums[start-1] && start<end) {
                            start++;
                        }
                        end--;
                    }
                    else if(sum<target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return ans;
    }

     */
}