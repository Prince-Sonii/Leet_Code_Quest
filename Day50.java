import java.util.Arrays;

class Day50 {
    //Qno. 1 Two Sum
    //Solution
    public int[] twoSum(int[] nums, int target) {
        int[] arr = Arrays.copyOf(nums,nums.length);
        int start=0;
        int end =arr.length-1;
        int index1=-1;
        int index2=-1;
        Arrays.sort(arr);
        while(start<arr.length && end>-1) {
            if(arr[start]+arr[end]==target) {
                break;
            }
            if(arr[start]+arr[end]>target) {
                end--;
            } else {
                start++;
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==arr[start] && index1<0) {
                index1=i;
            } else if(nums[i]==arr[end] && index2<0) {
                index2=i;
            }
        }
        return new int[]{index1, index2};
    }
}