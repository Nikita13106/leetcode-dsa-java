
class Solution {

    public String mergeAlternately(String word1, String word2) {
        // Use StringBuilder for efficient string concatenation
        StringBuilder ans = new StringBuilder();
        int i = 0;

        // Loop until the end of both strings is reached
        while (i < word1.length() || i < word2.length()) {
            
            // Append character from word1 if available
            if (i < word1.length()) {
                ans.append(word1.charAt(i));
            }

            // Append character from word2 if available
            if (i < word2.length()) {
                ans.append(word2.charAt(i));
            }
            i++;
        }
        // Convert StringBuilder to String and return the result
        return ans.toString();
    }
}
