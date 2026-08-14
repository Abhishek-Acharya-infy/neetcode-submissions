class Solution {
    public boolean isPalindrome(String s) {
        String process = s.replace(" ","");
        process = process.toLowerCase();
        process = process.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(process);
        int a = 0;
        int b = process.length()-1;
        for(int i=0;i<process.length()-1;i++){
            if(process.charAt(a)==process.charAt(b)){
                a++;
                b--;
            }else{
                return false;
            }
        }
        return true; 
    }
}
