class Day67 {
    //Qno. 2000 Reverse Prefix of Word
    //Solution
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        int i2=index+1;
        if(index>-1) {
            StringBuilder s = new StringBuilder();
            while(index>-1) {
                s.append(word.charAt(index));
                index--;
            }
            s.append(word, i2, word.length());
            return s.toString();
        }
        return word;
    }
}