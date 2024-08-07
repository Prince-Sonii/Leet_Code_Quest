class Day62 {
    //680 Valid Palindrome II
    //Solution
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end) {
            if(s.charAt(start)!=s.charAt(end)) {
                boolean leftInc = incDec(s,start+1,end);
                if(leftInc) {
                    return true;
                } else {
                    return incDec(s,start,end-1);
                }
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean incDec(String s, int start, int end) {
        while(start<end) {
            if(s.charAt(start)!=s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}