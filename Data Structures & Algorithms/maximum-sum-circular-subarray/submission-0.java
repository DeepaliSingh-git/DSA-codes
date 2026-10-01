class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globMin =nums[0], globMax=nums[0];
        int total=0;
        int max = 0, min = 0;
        for(int a : nums){
            max = Math.max(a, a+max);
            min = Math.min(a, a+min);
            total+=a;
            globMax = Math.max(globMax, max);
            globMin = Math.min(globMin, min);
        }
        return globMax >0 ? Math.max(globMax, total- globMin) : globMax;
    }
}