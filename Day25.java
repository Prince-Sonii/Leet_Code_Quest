class Day25 {
    //Qno. 436 Find Right Interval
    //Solution
    public int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        int index=0;
        for(int row=0;row<intervals.length;row++) {
            boolean filled = false;
            for(int row2=0;row2<intervals.length;row2++) {
                if(intervals[row][1] <=intervals[row2][0]) {
                    if(intervals[row][1] == intervals[row2][0]) {
                        ans[row] = row2;
                        filled = true;
                        break;
                    }
                    if(!filled) {
                        ans[row] = row2;
                        filled = true;
                    }
                    
                }
            }
            if(!filled) {
                ans[row] = -1;
            }
        }
        return ans;
    }
}