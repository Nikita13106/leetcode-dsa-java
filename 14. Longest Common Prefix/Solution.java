class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Handle edge cases
        if (strs.length == 0) return "";           // No strings in array
        if (strs.length == 1) return strs[0];      // Only one string, return it

        int j = 0; // Character index for comparison

        // Step 1: Find the index of the shortest string
        int min = 0;
        for (int l = 1; l < strs.length; l++) {
            if (strs[l].length() < strs[min].length()) {
                min = l;
            }
        }

        StringBuilder ans = new StringBuilder("");

        // Step 2: Compare characters of all strings column-wise (one by one)
        while (j < strs[min].length()) {
            int i = 0;
            boolean common = false;

            // Compare each adjacent pair: strs[i] and strs[i + 1]
            while (i < strs.length - 1) {
                if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                    i++;
                    common = true;
                } else {
                    // Mismatch found, return result so far
                    return ans.toString();
                }
            }

            // If all characters matched at this position, append to result
            if (common) {
                ans.append(strs[0].charAt(j)); // All match → take char from any string (e.g., strs[0])
            } else {
                break; // No match → stop
            }

            j++; // Move to next character position
        }

        return ans.toString(); // Return the final longest common prefix
    }
}
