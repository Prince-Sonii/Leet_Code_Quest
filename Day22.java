class Day22 {
    // Qno. 74 Search a 2D Matrix
    //Solution
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0) {
            if(matrix[row][col] == target) {
                return true;
            }
            if(target>matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}