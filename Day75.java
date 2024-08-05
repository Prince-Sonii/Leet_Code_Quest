class Day75 {
    //Qno. 1513 Number of Substrings With Only 1s
    //Solution
    static final int MOD = 1000000007;
    public int numSub(String s) {
        long ans = 0;
        int ones = 0;
        for (byte c : s.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1)) {
            if (c == 49) {
                ones++;
                ans += ones;
            } else {
                ones = 0;
            }
        }

        return (int) (ans % MOD);
    }   
}