class Day93 {
    //Qno. 476 Number Complement
    //Solution
    public int findComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();
        
        int mask = (1 << bitLength) - 1;
        
        return num ^ mask;
    }
}