class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int far =0;
        int n = s.length();

        while(!q.isEmpty()){
            int i =q.poll();
            int start = Math.max(i+ minJump, far+1);

            for(int j=start; j<Math.min(i+maxJump+1, n); j++){
                if(s.charAt(j)=='0'){
                    q.add(j);
                    if(j==n-1){
                        return true;
                    }
                }
            }
            far = i+maxJump;
        }
        return false;
    }
}