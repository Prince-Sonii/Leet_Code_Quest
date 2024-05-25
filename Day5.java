class Day5 {
    //Qno. 231 Power of two
    //Solution
    static boolean isPowerOfTwo(int n) {
        if(n<1) {
            return false;
        }
        while(n>1) {
            int a = n&1;
            if(a==1) {
                return false;
            }
            n=n>>1;
        }
        return true;
    }
}