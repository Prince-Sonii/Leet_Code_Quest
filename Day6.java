class Day6 {
    //Qno. 326 Power of three
    //Solution
    static boolean isPowerOfThree(int n) {
        if(n==1) {
            return true;
        }
        if(n==0) {
            return false;
        }
        return n%3==0 && isPowerOfThree(n/3);
    }
}