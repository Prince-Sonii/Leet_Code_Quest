class Day74 {
    //Qno. 1750 Minimum Length of String After Deleting Similar Ends
    //Solution
    public int minimumLength(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                char ch = s.charAt(i);
                while (i < n && s.charAt(i) == ch)
                    i++;

                while (j > i && s.charAt(j) == ch)
                    j--;
            } else
                break;
        }

        return j - i + 1;
    }
}