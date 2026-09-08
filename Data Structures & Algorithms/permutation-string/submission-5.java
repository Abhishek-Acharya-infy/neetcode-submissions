class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int windowSize=s1.length();
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        String window = "";
        for(int i=0;i<s2.length()-windowSize+1;i++){
            window = s2.substring(i,windowSize+i);
            char[] windowSorted = window.toCharArray();
            Arrays.sort(windowSorted);
            if(Arrays.equals(windowSorted,s1Array)){
                return true;
            }
        }
        return false;
    }
}
