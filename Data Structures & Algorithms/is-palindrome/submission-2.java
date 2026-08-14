class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s+" "+s.length());
        String first = s.substring(0,s.length()/2);
        String last = s.substring((s.length()/2),s.length());
        System.out.println(first+" "+last);
        int counter = 0;
        int i=0;
        int j=last.length()-1;
        while(counter<s.length()/2){
            if(first.charAt(i) == last.charAt(j)){
                i++;
                j--;
                System.out.println("counter "+counter);
            }else{
                return false;
            }
            counter++;
        }
        return true;
    }
}
