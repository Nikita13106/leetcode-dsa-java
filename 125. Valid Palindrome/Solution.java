class Solution {
    public boolean isPalindrome(String s) {

        // Return true if the string is null or empty (considered a valid palindrome)
        if (s == null || s.isEmpty()) return true;

        StringBuilder ans = new StringBuilder();

        // Step 1: Filter out only alphanumeric characters and convert to lowercase
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                ans.append(Character.toLowerCase(ch));
            }
        }

        // Step 2: Use two pointers to check if the cleaned string is a palindrome
        int start = 0;
        int end = ans.length() - 1;

        while (start <= end) {
            // If characters at both ends don't match, it's not a palindrome
            if (ans.charAt(start) != ans.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        // If all characters matched, it's a palindrome
        return true;
    }
}
