class Solution {
    public int findLucky(int[] arr) {
        // Create a frequency array of size 501 (since arr[i] can be at most 500)
        int[] freq = new int[501];

        // Count the frequency of each number in the array
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int max = -1; // Initialize max lucky number as -1 (default if none found)

        // Iterate through the frequency array to find lucky numbers
        for (int j = 1; j < freq.length; j++) {
            // A lucky number is one where the value equals its frequency
            if (freq[j] == j) {
                max = j; // Update max if a lucky number is found
            }
        }

        // Return the largest lucky number, or -1 if no lucky number exists
        return max;
    }
}
