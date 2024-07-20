class Day59 {
    //Qno. 1309 Decrypt String from Alphabet to Integer Mapping
    //Solution
    public String freqAlphabets(String s) {
        int ch;
        int index=s.length()-1;
        StringBuilder str = new StringBuilder();
        while(index>-1) {
            if(s.charAt(index)=='#') {
                ch = (((s.charAt(index-2)-'0')*10)+(s.charAt(index-1)-'0'));
                str.insert(0,(char)(ch+96));
                index-=3;
            } else {
                ch = (s.charAt(index)-'0');
                str.insert(0,(char)(ch+96));
                index--;
            }
        }
        return str.toString();
    }
}