class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;  
            }
        }
    }
}

/*
class Solution {
    public void rotate(int[][] matrix) {
       for(int i=0;i<matrix.length;i++){
        for(int j=i+1;j<matrix[i].length;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
       }
        for(int i=0;i<matrix.length;i++){
            int left=0,right=matrix[0].length-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
       } 
       System.out.print(Arrays.toString(matrix));
    }
}
*/
