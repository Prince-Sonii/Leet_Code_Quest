class Day16 {
    //Qno. 1217 Minimum Cost to Move Chips to The Same Position
    //Solution
    public int minCostToMoveChips(int[] position) {
       int even =0, odd=0;
       for(int i=0;i<position.length;i++) {
        if(position[i]%2==0) {
            even++;
        } else {
            odd++;
        }
       }
       if(even==position.length && odd == position.length) {
        return 0;
       }
       return Math.min(even,odd);

    }
}