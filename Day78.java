class Day78 {
    //Qno. 848 Shifting Letters
    //Solution
    public String shiftingLetters(String s, int[] shifts) {
        char[] res = s.toCharArray();
        long currShift = 0;
        
        for (int i = shifts.length -1 ;  i>= 0; i--) {
            currShift += shifts[i];
            res[i] = (char)(((res[i] - 'a' + currShift) % 26) + 'a');
        }
        
        return String.valueOf(res);    
    }
}