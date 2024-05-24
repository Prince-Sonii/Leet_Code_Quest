class Day4 {
    //Qno. 344 Reverse string
    //Solution
    static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    
}