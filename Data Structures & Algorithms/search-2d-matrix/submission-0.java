class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //treat entire 2-d array as one big sorted array

        int rows= matrix.length;
        int col=matrix[0].length;

        int start=0, end=rows*col-1;

        while(start<=end){
            int mid= start+(end-start)/2;
            int row=mid/col, cl=mid%col;
            if(target>matrix[row][cl]){
                start=mid+1;
            }
            else if(target<matrix[row][cl]){
                end= mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
