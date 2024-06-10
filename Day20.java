import java.util.Arrays;

class Day20 {
    //Qno. 350 Intersection of Two Arrays II
    //Solution
    public int[] intersect(int[] nums1, int[] nums2) {
        //Solution without taking any extra space
       int count =0;
       int index1=0;
       int index2=0;
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       while(index1<nums1.length && index2<nums2.length) {
        if(nums1[index1]<nums2[index2]) {
            index1++;
        }
        else if(nums1[index1]>nums2[index2]) {
            index2++;
        }
        else {
            nums1[count] = nums2[index2];
            index1++;
            index2++;
            count++;
        }
       }
       return Arrays.copyOf(nums1,count);
    }
}