class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;

        // Loop through all elements in the array
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i]; // XOR each number with xor
        }

        // The result will be the single number
        return xor;
    }
}
