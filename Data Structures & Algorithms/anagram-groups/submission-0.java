class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> ans = new ArrayList<>();
        Map<String,List<String>> ansFinal = new HashMap<>();
        for(String word:strs){
            char[] wordSrt = word.toCharArray();
            Arrays.sort(wordSrt);
            String key = new String(wordSrt);
            
            ansFinal
            .computeIfAbsent(key, k -> new ArrayList<>())
            .add(word);
        }
        return new ArrayList<>(ansFinal.values());
    
    }
}
