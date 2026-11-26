class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                        .boxed()
                        .distinct()
                        .collect(Collectors.toList());
        return list.size()!=nums.length;
    }
}