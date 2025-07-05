
class Solution {

    public int findNumbers(int[] nums) {
        int count = 0; // Initialize the counter for numbers with even number of digits

        // Loop through each number in the array
        for (int i = 0; i < nums.length; i++) {
            int digitCount = digits(nums[i]); // Get number of digits in current number

            // Check if number of digits is even
            if (digitCount % 2 == 0) {
                count++; // Increment the count
            }
        }

        return count; // Return the final count
    }

    // Helper method to count the number of digits in a given number
    public int digits(int num) {
        int count = 0;

        // Count digits by dividing the number by 10 in each step
        while (num > 0) {
            num = num / 10; // Remove the last digit
            count++;        // Increment digit count
        }

        return count; // Return the number of digits
    }
}
