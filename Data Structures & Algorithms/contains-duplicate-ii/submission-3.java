class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len= nums.length;
        for(int i=len-1; i>0;i--){
            for(int j=i-1; j>=0; j--){
                if(nums[i]==nums[j]){
                    return i-j<=k ? true: false;
                }
            }
        }
        return false;
    }
}