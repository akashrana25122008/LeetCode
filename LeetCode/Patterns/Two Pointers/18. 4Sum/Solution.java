class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                Set<Long> hashset = new HashSet<>();
                for(int k=j+1;k<n;k++){
                        long sum = (long) nums[i] + nums[j];
                        sum += (long) nums[k];
                        long fourth = (long) target-sum;
                        if(hashset.contains(fourth)){
                            List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                            Collections.sort(temp);
                            st.add(temp);
                        }
                        hashset.add((long) nums[k]);
                    
                }
            }
        }
        return new ArrayList<>(st);
    }
}