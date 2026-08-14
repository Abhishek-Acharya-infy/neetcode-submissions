class Solution {
    public boolean isAnagram(String s, String t) {
       ArrayList<Character> arrayList1 = new ArrayList<>();
        ArrayList<Character> arrayList2 = new ArrayList<>();
        if(s.length()==t.length())
        {
            char [] array1 = s.toCharArray();
            char [] array2 = t.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            return Arrays.equals(array1, array2);
        }else{
            return false;
        } 
    }
}
