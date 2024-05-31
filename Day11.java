class Day11 {
    //Qno. 1304. Find N Unique Integers Sum up to Zero
    //Solution
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;
        if(n==1) {
            return new int[]{0};
        }
        for(int i=-1;i>-n;i--) {
            if(index==n/2) {
                break;
            }
            ans[index] = i;
            index++;
        }
        if(n%2!=0) {
            ans[index]=0;
            index++;
        }
        for(int i=1;i<n;i++) {
            if(index==n) {
                break;
            }
            ans[index] =i;
            index++;
        }
        return ans;
    }
}