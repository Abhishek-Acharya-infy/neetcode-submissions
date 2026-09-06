class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int conseqOne = 0;
        int maxConseq=0;

        for(int num: nums){
            if(num==1){
                conseqOne++;
            }else{
                maxConseq=Math.max(conseqOne,maxConseq);
                conseqOne=0;
            }
        }
        return Math.max(maxConseq,conseqOne);
    }
}