import java.util.ArrayList;

class Day19 {
    //Qno. 349 Intersection of Two Arrays
    //Solution
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i]==nums2[j]) {
                    if(ans.indexOf(nums1[i])<0) {
                        ans.add(nums1[i]);
                    }
                }
            }
        }
        int[] result = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}