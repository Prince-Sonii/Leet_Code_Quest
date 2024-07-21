class Day60 {
    //Qno. 925 Long Pressed Name
    //Solution
    public boolean isLongPressedName(String name, String typed) {
        int index1=0;
        int index2=0;
        while(index2<typed.length()) {
            if(index1<name.length() && name.charAt(index1)==typed.charAt(index2) ) {
                index1++;
                index2++;
            }
            else if(index2>0 && typed.charAt(index2)==typed.charAt(index2-1)) {
                index2++;
            } else {
                return false;
            }
        } 
        return index1==name.length();
    }
}