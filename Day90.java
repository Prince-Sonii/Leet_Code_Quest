class Day90 {
    //Qno.338 Counting Bits
    //Solution
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        countBits(ans, 1, 1);
        return ans;
    }
    
    public void countBits(int[] ans, int n, int count) {
        if (n >= ans.length) return;
        ans[n] = count;
        int val = n<<1;
        countBits(ans, val, count);
        countBits(ans, val+1, count+1);
    }
}