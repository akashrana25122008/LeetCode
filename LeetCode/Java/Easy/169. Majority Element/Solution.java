import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        int threshhold = nums.length/2;
        HashMap<Integer,Integer> frequencies = new HashMap<>();
        for(int value :nums){
            int updatedfrequency = frequencies.getOrDefault(value,0) +1;
            frequencies.put(value,updatedfrequency);

            if(updatedfrequency>threshhold){
                return value;

            }
        }
        return -1;

    }
}