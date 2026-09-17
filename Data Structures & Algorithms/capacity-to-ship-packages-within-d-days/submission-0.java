class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;

        for(int a: weights){
            low = Math.max(low, a);
            high+=a;
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            int currW=0;
            int currD=1;

            for(int a: weights){
                if(currW+a<=mid){
                    currW+= a;
                }else{
                    currD++;
                    currW = a;
                }
            }
            if(currD<=days){
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}