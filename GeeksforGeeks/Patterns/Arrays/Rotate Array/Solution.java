class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        d = d%arr.length;
        int[] temp= new int[d];
        for(int i = 0; i<d;i++){
            temp[i] = arr[i];
            
        }
        for(int i=d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }
        for(int i =arr.length-d;i<arr.length;i++){
            arr[i]=temp[i-(arr.length-d)];
        }
    }
}