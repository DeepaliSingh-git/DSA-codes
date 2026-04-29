class Solution {
    public int binarySearch(int[] nums, int start, int end, int target){
        if(start>end) return -1;
        int mid= start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(target<nums[mid]){
            return binarySearch(nums,start,mid-1,target);
        }
        else{
            return binarySearch(nums,mid+1,end,target);
        }
    }
    public int search(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        return binarySearch(nums,start,end,target);   
    }
}
