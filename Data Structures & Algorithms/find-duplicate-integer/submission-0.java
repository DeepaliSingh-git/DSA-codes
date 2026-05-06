class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int a:nums){
            if(set.contains(a)){
                return a;
            }
            set.add(a);
        }
        return -1;
    }
}
