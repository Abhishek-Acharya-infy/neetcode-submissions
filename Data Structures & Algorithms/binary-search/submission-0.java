class Solution {
    public int search(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        list =  Arrays.stream(nums)
                .boxed()
                .toList();
        return list.indexOf(target);
    }
}
