class Day61 {
    //Qno.557 Reverse Words in a String III
    //Solution
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s,0,s.length());
        str.reverse();
        String[] ref = str.toString().split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<ref.length;i++) {
            ans.insert(0,ref[i]+" ");
        }
        return ans.toString().trim();
    }
}