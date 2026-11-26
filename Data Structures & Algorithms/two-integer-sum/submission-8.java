class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map1 = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            map1.put(nums[i],i);
        } 

        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map1.containsKey(diff) && map1.get(diff)!=i){
                ans[0]=i;
                ans[1]=map1.get(diff);
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
