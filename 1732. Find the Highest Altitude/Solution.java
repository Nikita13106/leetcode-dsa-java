class Solution {
    public int largestAltitude(int[] gain) {
        // Array to store altitude at each point (starting from 0)
        int[] ans = new int[gain.length + 1];
        ans[0] = 0;

        int j = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < gain.length; i++) {
            // Calculate current altitude by adding gain to previous altitude
            ans[j] = ans[j - 1] + gain[i];

            // Update max altitude
            max = Math.max(max, Math.max(ans[j], ans[j - 1]));
            j++;
        }

        return max;
    }
}
