import java.util.ArrayList;

class Day17 {
    //Qno. 54 Spiral Matrix
    //Solution
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        boolean[][] check = new boolean[matrix.length][matrix[0].length];
        int rowBegin=0;
        int rowEnd = matrix.length-1;
        int colBegin=0;
        int colEnd = matrix[0].length-1;
        while(rowBegin<=rowEnd && colBegin <= colEnd) {
            // to move right
            for(int i=colBegin;i<=colEnd;i++) {
                ans.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            // to move down
            for(int i=rowBegin;i<=rowEnd;i++) {
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;
            // to move left 
            if(rowBegin<=rowEnd){
                for(int i=colEnd;i>=colBegin;i--) {
                    ans.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            // to move up
            if(colBegin<=colEnd) {
                for(int i=rowEnd;i>=rowBegin;i--) {
                    ans.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return ans;
    }
    
}