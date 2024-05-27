class Day7 {
    //Qno. 1835 Find XOR Sum of All Pairs Bitwise AND
    //Solution
    static int getXORSum(int[] arr1, int[] arr2) {
        int xor1=0;
        int xor2=0;
        for(int element:arr1) {
            xor1=xor1^element;
        }
        for(int element:arr2) {
            xor2=xor2^element;
        }
        return xor1&xor2;
        
    }
}