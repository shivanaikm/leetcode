class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        boolean result=false;
        for(int i=0;i<m;i++){
            int n=matrix[i].length;
            if(target>=matrix[i][0] && target<=matrix[i][n-1]){
                result=binarySearch(matrix[i],target);
                if(result==true){
                    return result;
                }
                else{
                    return false;
                }
            }
        }
        return result;
    }

    public boolean binarySearch(int arr[],int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==arr[mid]){
                return true;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
        

    }
}