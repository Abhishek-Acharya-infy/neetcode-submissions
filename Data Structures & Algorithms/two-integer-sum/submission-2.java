class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] temp = nums.clone();
        int left=0; int right = nums.length-1;
        Arrays.sort(nums);
        while(left<right){
            if(nums[left]+nums[right]==target){
                if(nums[left]!=nums[right]) {
                    return Arrays.stream(new int[]{index(temp,nums[left]),index(temp,nums[right])}).sorted().toArray();
                }
                else{
                    int finalLeft = nums[left];
                    return IntStream.range(0, temp.length)
                            .filter(i -> temp[i] == finalLeft)
                            .toArray();
                }
            }else if(nums[left]+nums[right]<target){
                left++;
            }else if(nums[left]+nums[right]>target){
                right--;
            }
        }
        return new int []{0,0};
    }
    private int index(int[] array, int target){
        return IntStream.range(0, array.length)
                .filter(i -> array[i] == target)
                .findFirst()
                .orElse(-1);
    }
}
