class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int xor2= 0;
        for(int i =1; i<=n;i++){
            xor =xor^i;
        }
        for(int i =0;i<n;i++){
            xor2= xor2^nums[i];

        }
        return xor^xor2;
    }
}