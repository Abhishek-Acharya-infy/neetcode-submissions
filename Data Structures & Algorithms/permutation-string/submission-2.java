class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int windowSize=s1.length();
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        String sortedS1= String.valueOf(s1Array);
        StringBuilder window = new StringBuilder();
        for(int i=0;i<s2.length()-windowSize+1;i++){
            for(int j=0;j<windowSize;j++){
                window.append(s2.charAt(i+j));
            }
            char[] windowArr = window.toString().toCharArray();
            Arrays.sort(windowArr);
            String windowSorted= String.valueOf(windowArr);
            if(sortedS1.equals(windowSorted)){
                return true;
            }
            window= new StringBuilder();
        }
        return false;
    }
}
