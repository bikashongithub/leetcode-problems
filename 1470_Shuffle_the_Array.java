class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[nums.length];
        for (int i = 0, j = 0; i < n; i++, j += 2) {
            shuffledArray[j] = nums[i];
            shuffledArray[j + 1] = nums[i + n];

        }

        return shuffledArray;

    }
}