class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=i+1;
        while(i<j && j<nums.length){
            if(nums[i]!=nums[j]){
                int temp = nums[i+1];
                nums[i+1]=nums[j];
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i+1;
    }
}