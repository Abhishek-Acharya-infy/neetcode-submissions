class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for(char ch:s.trim().toCharArray()){
            len++;
            if(ch==' ')
                len=0;
        }
        return len;
    }
}