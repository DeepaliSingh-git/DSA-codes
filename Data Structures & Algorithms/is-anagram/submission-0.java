class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        char[] tArr = t.toCharArray();
        int k=0;
        for(int i=0; i<s.length(); i++){
            for(int j=k; j<tArr.length; j++){
                if(s.charAt(i)==tArr[j]){
                    char temp = tArr[j];
                    tArr[j]=tArr[k];
                    tArr[k]= temp;
                    k++;
                    break;
                }
            }        
        }
        if(k==s.length()){
            return true;
        }
        else{
            return false;
        }


    }
}
