class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n= nums.length;
        int[] output = new int[n];
        int prod=1;
        int zeroCount = 0;

        for(int i=0; i<n; i++){
            if (nums[i] != 0) prod = prod*nums[i];
            else zeroCount++;
        }
        for(int i=0; i<n; i++){
            if (zeroCount > 1) output[i] = 0;
            else if (zeroCount == 1){
                output[i] = (nums[i] == 0) ? prod : 0;
            } 
            else output[i]= prod/nums[i];
        }
        return output;

    }
}