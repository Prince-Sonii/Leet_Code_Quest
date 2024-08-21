class Day91 {
    //Qno. 191 Number of 1 Bits
    //Solution
    public int hammingWeight(int n) {
        int count = 0;
        while(n>0) {
            int a=n&1;
            if(a==1) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}