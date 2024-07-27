class Day66 {
    //Qno. 1768 Merge Strings Alternately
    //Solution
    public String mergeAlternately(String word1, String word2) {
        int i1=0;
        int i2=0;
        StringBuilder s = new StringBuilder();
        while(i1<word1.length() && i2<word2.length()) {
            s.append(word1.charAt(i1));
            s.append(word2.charAt(i2));
            i1++;
            i2++;
        }
        if(i1<word1.length()) {
            s.append(word1, i1, word1.length());
        }
        if(i2<word2.length()) {
            s.append(word2, i2, word2.length());
        }
        return s.toString();
    }
}