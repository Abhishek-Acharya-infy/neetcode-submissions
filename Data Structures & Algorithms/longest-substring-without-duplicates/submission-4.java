class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        int ans=0;
        for(char ch:s.toCharArray()){
            if(stack.contains(ch)){
                if(stack.getFirst().equals(ch)){
                    stack.removeFirst();
                }else if(stack.getLast().equals(ch)) {
                    stack.clear();
                }else{
                    stack = new ArrayList<Character>(stack.subList(stack.indexOf(ch)+1,stack.size()));
                }
            }
            stack.add(ch);
            ans = Math.max(ans,stack.size());
        }
        return ans;
    }
}
