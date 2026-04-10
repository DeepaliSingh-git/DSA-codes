class Solution {
    public boolean hasDuplicate(int[] nums) {
       int n=nums.length;
       int flag=0;
       for(int i=0; i<n; i++){
        int key = nums[i];
        for(int j=i+1; j<n;j++){
            if(key==nums[j]){
                flag=1;
            }
        }
        
       }
       if (flag==1) return true;
       else{
        return false;
       }

       
    }
}