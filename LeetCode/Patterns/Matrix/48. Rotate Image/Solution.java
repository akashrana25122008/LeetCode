class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= temp;

            }
        }
        for(int i =0;i<n;i++){
            reverse(matrix[i]);
        }
    }

        private void reverse(int [] arr){
            int left = 0;
            int right = arr.length-1;
            while(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        
    }
}