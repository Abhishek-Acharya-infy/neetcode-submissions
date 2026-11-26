class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> openPara = new ArrayList<>(List.of('{', '[', '('));
        ArrayList<Character> closePara = new ArrayList<>(List.of('}', ']', ')'));
        char chLast='a';
        if(s.length()%2==1){
            return false;
        }

        ArrayList<Character> stackList = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(openPara.contains(ch)){
                stackList.add(ch);
            }else if(closePara.contains(ch)){
                if(!stackList.isEmpty())
                    chLast = stackList.getLast();
                if(openPara.indexOf(chLast) == closePara.indexOf(ch)){
                    if(!stackList.isEmpty())
                        stackList.removeLast();
                    continue;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return stackList.isEmpty();
    }
}
