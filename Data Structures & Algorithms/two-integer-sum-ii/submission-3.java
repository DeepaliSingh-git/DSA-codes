class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int sum=0;
        int[] res=new int[2];
        int r=numbers.length-1;
        while(l<r){
            sum= numbers[l]+numbers[r];
            if(sum==target){
                res[0]=l+1;
                res[1]=r+1;
            }
            if(sum> target) r--;
            else{
                l++;
            }
        }
        return res;

    }
}
