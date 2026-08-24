class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            int sum = numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else{
                ans[0]=left+1;
                ans[1]=right+1;
            }
        }
        return ans;
    }
}
