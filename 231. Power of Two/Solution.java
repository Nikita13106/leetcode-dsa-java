class Solution {

    // Main function to check if a number is a power of two
    public boolean isPowerOfTwo(int n) {
        return ans(n, 0);  // Start checking powers from 2^0
    }

    // Recursive helper function
    public boolean ans(int n, int start) {
        // Base case: if 2^start == n, it's a power of two
        if (Math.pow(2, start) == n) {
            return true;
        }

        // If 2^start exceeds n, it means n is not a power of two
        if (Math.pow(2, start) > n) {
            return false;
        }

        // Recursive case: try the next power
        return ans(n, start + 1);
    }
}
