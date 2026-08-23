class Solution {
    public int longestConsecutive(int[] nums) {
        int counter = 1;
        int max = 1;
        int prev = nums.length>0?nums[0]:0;

        Arrays.sort(nums);

        for(int num:nums){
            if(num==prev)
                continue;
            if(num==prev+1){
                counter++;
            }else {
                max=Math.max(max,counter);
                counter=1;
            }
            prev=num;
        }
        return nums.length>0?Math.max(max,counter):0;
    }
}
