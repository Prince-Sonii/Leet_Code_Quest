class Day69 {
    //Qno. 686 Repeated String Match
    //Solution
    public int repeatedStringMatch(String a, String b) {
        boolean[] bucket = new boolean[26];
        for (char c : a.toCharArray()) bucket[c - 'a'] = true;
        for (char c : b.toCharArray()) 
            if (!bucket[c - 'a']) return -1;
        
        int cnt = b.length() / a.length();

        StringBuilder sb = new StringBuilder(a.repeat(cnt));

        for (int i = 0;i < 3;i++) {
            if (sb.indexOf(b) >= 0) return cnt + i;
            sb.append(a);
        }
        return -1;
    }
}