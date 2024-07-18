class Day57 {
    //Qno. 1773 Count Items Matching a Rule
    //Solution
    /*
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int count = 0;
       int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
       return getcount(items,count,index,0,ruleValue);
    }
    int getcount(List<List<String>> items, int count, int index, int start, String ruleValue){
        if(start == items.size()) {
            return count;
        }
        if(items.get(start).get(index).equals(ruleValue)) {
            count++;
        }
        return getcount(items,count,index,start+1,ruleValue);
    }*/
}