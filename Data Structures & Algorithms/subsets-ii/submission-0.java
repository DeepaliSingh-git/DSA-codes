class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        int idx =0;
        int prev =0;
        for(int i=0; i<nums.length; i++){
              idx =(i>=1 && nums[i]==nums[i-1])? prev:0;
              prev= res.size();
              for(int j= idx; j<prev; j++){
                List<Integer> subset = new ArrayList<>(res.get(j));
                subset.add(nums[i]);
                res.add(subset);
              }
        }
        return res;
    }
}
