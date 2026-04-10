class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set= new HashSet<>();
        for(int a : nums){
            num_set.add(a);
        }
        int longest=0;
        for( int a : nums){
            if(!num_set.contains(a-1)){
                int length =1;
                while(num_set.contains(a+length)){
                    length++;
                }
                longest=Math.max(longest, length);
            }
        }
        return longest;
    }
}
