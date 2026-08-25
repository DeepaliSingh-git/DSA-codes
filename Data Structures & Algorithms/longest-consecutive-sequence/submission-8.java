class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max_count=0;
        for(int a:nums){
            if(!set.contains(a)){
                set.add(a);
            }
        }
        for(int a:nums){
            if(!set.contains(a-1)){
                int count=0;
                while(set.contains(a+count)){
                    count++;
                }
                max_count=Math.max(count, max_count);
            }
        }
        return max_count;
    }
}
