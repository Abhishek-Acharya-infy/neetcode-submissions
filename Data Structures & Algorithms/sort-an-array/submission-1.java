class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums; // Base case: array with 0 or 1 element is already sorted
        }

        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        // Recursively sort both halves
        sortArray(left);
        sortArray(right);

        // Merge sorted halves back into original array
        return merge(nums, left, right);
    }
    private static int[] merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right sub-arrays and pick smaller one
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left sub-array if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right sub-array if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return arr;
    }
}