class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length * 2;
        int[] atwo = new int[l];
        for (int i = 0; i < l; i++) {
            if (i < nums.length)
                atwo[i] = nums[i];
            // filling the later same half of the second array.
            else {
                atwo[i] = nums[i - nums.length];
            }
        }
        return atwo;

    }
}