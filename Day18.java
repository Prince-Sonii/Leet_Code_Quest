class Day18 {
    //Qno. 1351 Count Negative Numbers in a Sorted Matrix
    //Solution
    public int countNegatives(int[][] grid) {
        int row=0;
        int col=grid[0].length-1;
        int count =0;
        while(row<grid.length && col>=0) {
            if(grid[row][col]<0) {
                count+=grid.length-row;
                col--;
            } else {
                row++;
            }
        }
        return count;
    }
}