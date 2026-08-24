class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a: nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int k : map.keySet()){
            if(map.get(k)> nums.length/3){
                res.add(k);
            }
        }
        return res;
    }
}