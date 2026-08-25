class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map =new HashMap<>();
        int n=nums.length/3;
        for(int a:nums){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(int k: map.keySet()){
            if(map.get(k)>n){
                res.add(k);
            }
        }
        return res;
    }
}