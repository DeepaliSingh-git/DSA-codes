class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for(int a : nums){
            set.add(a);
        }
        int max=0;
        for(int a: nums){
            if(!set.contains(a-1)){
                int count=1;
                while(set.contains(a+count)){
                    count++;
                }
                max= Math.max(max, count);
            }
        }
        return max;
    }
}
