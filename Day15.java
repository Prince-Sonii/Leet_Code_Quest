class Day15 {
    //Qno. 566 Reshape the Matrix
    //Solution
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row*col!=r*c) {
            return mat;
        }
        if(r==row && c==col) {
            return mat;
        }
        int [][] ans = new int[r][c];
        int position=0;
        while(position < r*c) {
            ans[position/c][position%c] = mat[position/col][position%col];
            position++;
        }
        return ans;
    }
}