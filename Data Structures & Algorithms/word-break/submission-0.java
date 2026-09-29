class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[n]=true;

        for(int i=n-1; i>=0; i--){
            for(String a: wordDict){
                int len = a.length();
                if((i+len)<= n && s.substring(i, i+len).equals(a)){
                    dp[i]= dp[i+len];
                }
                if(dp[i]){
                    break;
                }
            }
        }
        return dp[0];
    }
}
