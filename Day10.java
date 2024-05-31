import java.util.ArrayList;

class Day10 {
    //Qno.1380. Lucky Numbers in a Matrix
    //Solution
    //to run this code on LeetCode just write List instead of ArrayList on declaration
    public ArrayList<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++) {
            int minFromRowIndex = 0; 
            boolean maxFromElement =true;
            int minFromRow = matrix[i][0];
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j]<=minFromRow) {
                    minFromRow = matrix[i][j];
                    minFromRowIndex=j;
                }
            }
            // here we'll get the minimun element from ith row
            //now we have to check that the minimum element is maximum in it's column or not
            for(int k=0;k<matrix.length;k++) {
                if(matrix[i][minFromRowIndex]<matrix[k][minFromRowIndex]) {
                    maxFromElement = false;
                }

            }
            //if it's maximum in its column then add it to list
            if(maxFromElement) {
                list.add(matrix[i][minFromRowIndex]);
            }
        }
        return list;
    }
}