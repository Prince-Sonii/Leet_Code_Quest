class Day81 {
    //Qno. 1023 Camelcase Matching
    //Solution
    /*
    public List<Boolean> camelMatch(String[] queries, String pattern) 
    {
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i<queries.length;i++)
        {
            if(match(queries[i],pattern))
                list.add(true);
            else list.add(false);
        }
        return list;
    }
    boolean match(String word, String pattern)
    {
        int m= word.length(),n=pattern.length();
        int ptr1=0,ptr2=0;
        while(ptr1<m && ptr2<n)
        {
            if(word.charAt(ptr1)==pattern.charAt(ptr2))
                ptr2++;
            else if(Character.isUpperCase(word.charAt(ptr1)))
                return false;
            ptr1++;
        }
        if(ptr2<n) return false;
        while(ptr1<m)
        {
            if(Character.isUpperCase(word.charAt(ptr1)))
                return false;
            ptr1++;
        }
        return true;
    }
    
     */
}