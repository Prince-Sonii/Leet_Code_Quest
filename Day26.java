/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }

 */
class Day26 {
    //Qno. 1095 Find in Mountain Array
    //Solution
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = peakIndex(mountainArr);
        int initialIndex = tillPeakIndex(target, mountainArr,0,peakIndex);
        if(initialIndex==-1) {
            return afterPeakIndex(target, mountainArr,peakIndex,mountainArr.length()-1);
        }
        return initialIndex;
        
  }
    public int peakIndex(MountainArray mountainArr) {
        int start =0;
        int end = mountainArr.length()-1;
        while(start<end) {
            int mid = start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)) {
                end = mid;
            }
            else {
                start =mid+1;
            }
        }
        return end;
    }
    
    public int afterPeakIndex(int target, MountainArray mountainArr , int start, int end) {
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target==mountainArr.get(mid)) {
                return mid;
            }
            if(mountainArr.get(mid)>target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;

    }
    public int tillPeakIndex(int target , MountainArray mountainArr, int start, int end) {
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target==mountainArr.get(mid)) {
                return mid;
            }
            if(mountainArr.get(mid)>target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
    
}
