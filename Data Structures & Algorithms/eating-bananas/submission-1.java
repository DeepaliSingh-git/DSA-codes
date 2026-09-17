class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high=0;
        //find highest pile
        for(int a:piles){
            high = Math.max(high,a);
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            //calculate hours to finish all piles
            int hours=0;
            for(int a:piles){
                hours+= (a+mid-1)/mid;
            }
            if(hours<=h){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return low;
    }
}
