class Day71 {
    //Qno. 1898 Maximum Number of Removable Characters
    //Solution
    public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0, right = removable.length;
        char[] input = s.toCharArray();
        char[] sequence = p.toCharArray();

        while (left <= right) {
            int middle = right - (right - left) / 2;
            char[] afterRemoval = remove(input, removable, middle);
            if (isSubsequence(afterRemoval , sequence))
                left = middle + 1;
            else
                right = middle - 1;
        }
        return right;
    }

    private char[] remove(char[] s, int[] removable, int k) {
        char[] symbols = s.clone();
        for (int i = 0; i < k; i++)
            symbols[removable[i]] = Character.MIN_VALUE;
        return symbols;
    }

    private boolean isSubsequence(char[] s1 , char[] s2){
        int foundIndex = 0;
        int ptr1 = 0;

        while(ptr1 < s1.length && foundIndex < s2.length){
            if (s1[ptr1] == s2[foundIndex])
                foundIndex++;
            ptr1++;
        }
        
        return foundIndex == s2.length;
    }
}