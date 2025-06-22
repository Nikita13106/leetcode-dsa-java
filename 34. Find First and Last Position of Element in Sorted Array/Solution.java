class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        result[0] = search(nums, target, true);   // Find first occurrence
        result[1] = search(nums, target, false);  // Find last occurrence
        return result;
    }

    static int search(int[] nums, int target, boolean findFirst) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                result = mid;
                if (findFirst) {
                    end = mid - 1;   // Keep searching on the left
                } else {
                    start = mid + 1; // Keep searching on the right
                }
            }
        }
        return result;
    }
}
