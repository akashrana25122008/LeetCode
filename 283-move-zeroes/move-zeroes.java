class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int index =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
            temp[index] = nums[i];
            index++;

            }
        }
        for(int i = 0;i<temp.length;i++){
            nums[i] = temp[i];
        }
        for(int i = temp.length;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}