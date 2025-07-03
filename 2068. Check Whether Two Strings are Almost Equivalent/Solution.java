
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        
        // Arrays to count frequency of each letter (a to z) in both words
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count characters in word1
        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            freq1[ch - 'a']++; // 'a' maps to index 0, 'b' to 1, ..., 'z' to 25
        }

        // Count characters in word2
        for (int j = 0; j < word2.length(); j++) {
            char a = word2.charAt(j);
            freq2[a - 'a']++;
        }

        // Compare the difference in frequency for each character
        for (int k = 0; k < 26; k++) {
            int diff = freq1[k] - freq2[k];

            // Make the difference positive (absolute value)
            if (diff < 0) {
                diff = -diff;
            }

            // If the difference is more than 3, return false
            if (diff > 3) {
                return false;
            }
        }

        // If all character differences are 3 or less, return true
        return true;
    }
}
