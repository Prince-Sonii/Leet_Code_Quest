class Day55 {
    //Qno. 977 Squares of a Sorted Array
    //Solution
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int index =ans.length-1;
        int startIndex = 0;
        int endIndex = nums.length-1;
        while(index>-1) {
            if(Math.abs(nums[startIndex])>Math.abs(nums[endIndex])) {
                ans[index] = nums[startIndex]*nums[startIndex];
                startIndex++;
            } else {
                ans[index] = nums[endIndex]*nums[endIndex];
                endIndex--;
            }
            index--;
        } 
        return ans;
    }
}