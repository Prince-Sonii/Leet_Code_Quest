class Day64 {
    //Qno. 1668 Maximum Repeating Substring
    //Solution
    public int maxRepeating(String sequence, String word) {
        int count=0;
        StringBuilder st = new StringBuilder();
        st.append(word);
        while(sequence.contains(st)){
            count++;
            st.append(word);
        }
        return count;
    }
}