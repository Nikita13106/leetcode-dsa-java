
class Solution {
    public int[] sortedSquares(int[] nums) {
        // Pointers at both ends of the array
        int left = 0;
        int right = nums.length - 1;

        // Index for filling result array from end to start
        int ans = nums.length - 1;

        // Array to store the result
        int[] result = new int[nums.length];

        // Loop until both pointers meet
        while (left <= right) {
            // Square of the number at the left pointer
            int leftSquare = nums[left] * nums[left];

            // Square of the number at the right pointer
            int rightSquare = nums[right] * nums[right];

            // Place the larger square at the current 'ans' position
            if (leftSquare > rightSquare) {
                result[ans] = leftSquare;
                left++; // Move left pointer to the right
            } else {
                result[ans] = rightSquare;
                right--; // Move right pointer to the left
            }

            // Move to the next position from the end
            ans--;
        }

        // Return the sorted squares array
        return result;
    }
}
