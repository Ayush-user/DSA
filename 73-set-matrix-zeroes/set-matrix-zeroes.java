class Solution {
    static int value=Integer.MIN_VALUE+10;
    public int[][] setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j]==0) {
                    changeRow(i,matrix);
                    changeCol(j,matrix);
                }
            }
        }
        changeVal(matrix);
        return matrix;
    }
    public void changeRow(int i,int[][]matrix) {
        for(int j=0;j<matrix[i].length;j++) {
            if(matrix[i][j]!=0 ) {
                matrix[i][j]=value;
            }
        }
    }

    public void changeCol(int j,int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][j]!=0 ) {
                matrix[i][j]=value;
            }
        }
    }

    public void changeVal(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j]==value) {
                    matrix[i][j]=0;
                }
            }
        }
    }
}