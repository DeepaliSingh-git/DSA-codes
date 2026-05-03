class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) break; 
            if(i>0 && nums[i]==nums[i-1]) continue; //skip for same element
            int l=i+1, r=nums.length-1;
            while(l<r){
                sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){ //skip for same element
                        l++;
                    }
                }
                else if(sum>0) r--;
                else l++;
            }
        }
        return res;
    }
}
