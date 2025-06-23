class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int xor = x ^ y; 
        //(xor of same bits gives 0 , different bits gives 1)

        String ans = String.format("%32s", Integer.toBinaryString(xor)).replace(' ', '0');
        //Integer.toBinaryString(xor) converts integer to binary , String.format, This formats the binary string to be 32 characters wide.
        //If the original string is shorter, it fills the left side with spaces and replace replaces the spaces with zeroes

        for (int i = 31; i >= 0; i--) {
            if (ans.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
