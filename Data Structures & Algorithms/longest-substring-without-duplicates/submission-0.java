class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        int l=0;
        int count=0;

        for(int i=0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            count= Math.max(count, i-l+1);
        }
        return count;
    }
}
