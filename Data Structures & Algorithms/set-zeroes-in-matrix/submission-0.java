class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        boolean[] arr1 = new boolean[rows];
        boolean[] arr2 = new boolean[columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    arr1[i] = true;
                    arr2[j] = true;
                }
            }
        }
        for(int i=0; i<rows;i++){
            if(arr1[i]){
                for(int j=0; j<columns; j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0; j<columns; j++){
            if(arr2[j]){
                for(int i=0; i<rows; i++){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
