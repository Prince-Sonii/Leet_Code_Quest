class Day56 {
    //Qno .1528 Shuffle String
    public String restoreString(String s, int[] indices) {
        char[] c = new char[indices.length];
        for(int i=0;i<indices.length;i++) {
            c[indices[i]] = s.charAt(i);
        }
        return String.valueOf(c);
        // return new String(c); another way of returning
    }
}