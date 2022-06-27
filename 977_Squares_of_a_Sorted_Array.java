class Solution {
    public int[] sortedSquares(int[] nums) {
        int square;
        for (int i = 0; i < nums.length; i++) {
            square = nums[i] * nums[i];
            nums[i] = square;
        }

        // sorting the resulted array
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap nums[j+1] and nums[j]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;

    }
}

// solution 2
/*
 *
 * for(int i=0; i<nums.length; i++) {
 * nums[i] = nums[i]*nums[i];
 * }
 *
 * Arrays.sort(nums);
 * return nums;
 *
 */