class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        //i,subset,total, nums, target
        dfs(0,new ArrayList<>(),0,nums, target);
        return res;
    }
    private void dfs(int i, List<Integer> subset, int total, int[] nums, int target){
        if(total==target){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int j=i; j<nums.length; j++){
            if(total+nums[j]>target){
                return;
            }
            subset.add(nums[j]);
            dfs(j,subset, total+nums[j], nums, target);
            subset.remove(subset.size()-1);
        }
    }
}
