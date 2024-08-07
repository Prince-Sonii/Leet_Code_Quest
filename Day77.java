class Day77 {
    //Qno. 1208 Get Equal Substrings Within Budget
    //Solution
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] arr = new int[n];
        char[] s1 = s.toCharArray(), t1 = t.toCharArray();
        for(int i = 0; i <n; i++) {
            arr[i] = Math.abs(s1[i] - t1[i]);
        }
        int cost = 0, start = 0, end = 0, maxLength = 0;

        while(start<n && end<n) {
            cost += arr[end++];
            if(cost <= maxCost) maxLength = Math.max(maxLength, end-start);
            else{
                while(cost > maxCost){
                    cost -= arr[start++];
                }
            }
        }
        return maxLength;
    }
}