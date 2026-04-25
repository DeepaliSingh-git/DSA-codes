class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int result[]= new int[2];
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                int sum=numbers[i]+numbers[j];
                if(sum==target){
                    result[0]=i+1;
                    result[1]=j+1;
                }
            }
        }
        return result;
    }
}
