class Solution {
    public int maximum69Number (int num) {
        // Convert the integer to a mutable string (StringBuilder)
        StringBuilder n = new StringBuilder("" + num);

        // Loop through each character to find the first occurrence of '6'
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '6') {
                // Replace the first '6' with '9' to maximize the number
                n.setCharAt(i, '9');
                break; // Only change the first '6' and exit the loop
            }
        }

        // Convert the updated string back to an integer and return it
        return Integer.parseInt(n.toString());
    }
}
