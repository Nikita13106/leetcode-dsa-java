
class Solution {

    // Main method to move zeroes to the end while maintaining the relative order of non-zero elements
    public void moveZeroes(int[] nums) {

        // Perform a bubble sort-like pass to push zeroes to the end
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false; // Track if any swapping happened in this iteration

            // Inner loop to move zeroes one step towards the end
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] == 0) {
                    // Swap zero with the next element
                    swap(nums, j, j + 1);
                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no swapping happened in this iteration, array is already arranged
            if (!swapped) {
                break;
            }
        }
    }

    // Helper method to swap elements at two indices in the array
    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
