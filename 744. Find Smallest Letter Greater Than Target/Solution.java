class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // If target is greater than or equal to all letters,
        // wrap around and return the first character.
        if (start == letters.length) {
            return letters[0];
        }

        return letters[start];
    }
}
