class Day58 {
    //Qno. 1704 Determine if String Halves Are Alike
    //Solution
    public boolean halvesAreAlike(String s) {
        String vowel = "aeiou";
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++) {
            if(i<s.length()/2) {
                if(vowel.contains(String.valueOf(s.charAt(i)).toLowerCase())) {
                    count1++;
                }
            } else if(vowel.contains(String.valueOf(s.charAt(i)).toLowerCase())) {
                count2++;
            }
        }
        return count1==count2;
    }
}