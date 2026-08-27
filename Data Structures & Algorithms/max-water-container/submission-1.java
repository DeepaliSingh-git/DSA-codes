class Solution {
    public int maxArea(int[] heights) {
        int max_area=0;
        int i=0;
        int j=heights.length-1;

        while(i<j){
            int area=0;
            if(heights[i]<heights[j]){
                area = Math.min(heights[i], heights[j])*(j-i);
                i++;
            } else{
                area = Math.min(heights[i], heights[j])*(j-i);
                j--;
            }
            max_area = Math.max(max_area, area);
        }
        return max_area;
    }
}
