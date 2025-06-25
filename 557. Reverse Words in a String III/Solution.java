class Solution {
    public String reverseWords(String s) {
        // Split the sentence into array of individual words
        String[] words = s.split(" ");

        // StringBuilder to store the final reversed sentence
        StringBuilder ans = new StringBuilder();

        // Loop through each word in the array
        for (int i = 0; i < words.length; i++) {
            // Reverse the current word using StringBuilder
            StringBuilder str = new StringBuilder(words[i]);
            str.reverse();

            // Append the reversed word to the final answer
            ans.append(str);

            // Add space after the word (except after the last word)
            if (i != words.length - 1) {
                ans.append(" ");
            }
        }

        // Convert StringBuilder to string and return
        return ans.toString();
    }
}
