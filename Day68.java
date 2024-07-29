class Day68 {
    //Qno. 58 Length of Last Word
    //Solution
    public int lengthOfLastWord(String s) {
       s = s.trim();
        int length = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' ' ){
                length++;
            }
            else{
                break;
            }
        }
        return length;
    }
}