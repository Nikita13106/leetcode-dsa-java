class Solution {
    public int hammingWeight(int n) {
        // Brute-force way using binary string (commented out for reference)
        /*
        int count = 0;
        String binary = Integer.toBinaryString(n); // Convert integer to binary string
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++; // Count how many '1's are in the string
            }
        }
        return count;
        */

        // More efficient way using bitwise operations
        int count = 0;

        while (n != 0) {
            // Check if the last bit is 1
            if ((n & 1) == 1) {
                count++; // If yes, increment the count
            }
            // Right shift the bits of n by 1 (signed shift)
            n = n >> 1;
        }

        return count; // Return total number of 1s in binary representation
    }
}
