class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length-1);
        return nums;
    }
    private void mergesort(int[] nums, int start, int end){
        if(start>=end) return;
        int mid= start+(end-start)/2;
        mergesort(nums,start,mid);
        mergesort(nums, mid+1, end);
        merge(nums, start, mid, end);
    }
    private void merge(int[] nums, int s, int m, int e){
        if(s>=e) return;
        ArrayList<Integer> temp = new ArrayList<>();
        int i=s;
        int j=m+1;
        while(i<=m && j<=e){
            if(nums[i]<=nums[j]){
                temp.add(nums[i]);
                i++;
            }
            else{
                temp.add(nums[j]);
                j++;
            }
        }
        while(i<=m){
            temp.add(nums[i]);
            i++;
        }
        while(j<=e){
             temp.add(nums[j]);
             j++;
        }
        for(int k=s; k<=e; k++){
            nums[k]=temp.get(k-s);
        }
    }
}