class Solution {
    public int maxProduct(int[] nums) {

        //  Method 1: Using sorting (less efficient)
        // Arrays.sort(nums);
        // return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        // Time Complexity: O(n log n)

        //  Method 2: More efficient (One-pass scan)
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        // Time Complexity: O(n)
        return (max1 - 1) * (max2 - 1);
    }
}
