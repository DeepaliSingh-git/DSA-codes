class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        //i,subset,total,nums,target
        dfs(0,new ArrayList<>(),0,candidates, target);
        return res;
    }
    private void dfs(int i, List<Integer>subset, int total, int[] nums, int target){
        if(total==target){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int j=i;j<nums.length; j++){
            if(j>i && nums[j]==nums[j-1]) continue; //skip duplicatrs
            if(total + nums[j]>target){
                break;
            }
            subset.add(nums[j]);
            dfs(j+1,subset,total+nums[j],nums,target);
            subset.remove(subset.size()-1);
        }      
    }
}
