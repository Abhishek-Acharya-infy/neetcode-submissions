class Solution {
    public boolean isAnagram(String s, String t) {
       ArrayList<Character> arrayList1 = new ArrayList<>();
        ArrayList<Character> arrayList2 = new ArrayList<>();
        if(s.length()==t.length())
        {
            char [] array1 = s.toCharArray();
            char [] array2 = t.toCharArray();
            for (int i=0;i<s.length();i++){
                arrayList1.add(array1[i]);
                arrayList2.add(array2[i]);
            }
            Collections.sort(arrayList1);
            Collections.sort(arrayList2);
            if(arrayList1.equals(arrayList2)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        } 
    }
}
