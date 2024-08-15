class Day85 {
    //Qno. 1163 Last Substring in Lexicographical Order
    //Solution
    public String lastSubstring(String s) {
        int i = 0;
        int j = 1;
        int k = 0;
        int n = s.length();
        char[] ca = s.toCharArray();
        while (j + k < n){
            if (ca[i + k] == ca[j + k]) {
                k++;
            } else if (ca[i + k] > ca[j + k]) {
                j = j + k + 1;
                k = 0;
            } else {
                i = Math.max(i + k + 1, j);
                j = i + 1;
                k = 0;
            }
        }
        return s.substring(i);
    }
}