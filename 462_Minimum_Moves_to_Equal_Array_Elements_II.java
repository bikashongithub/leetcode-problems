class Solution {
    public int minMoves2(int[] nums) {
        // sort the array in ascending order
        Arrays.sort(nums);
        int minMoves = 0;

        // get every element in the array to middle element of the array(which will take
        // min moves)
        int m = nums[nums.length / 2]; // median element
        for (int i = 0; i < nums.length; i++) {
            // checking for i less than median element index (to subtract smaller val from
            // higher val )
            if (i < nums.length / 2) {
                minMoves += m - nums[i];
            } else {
                minMoves += nums[i] - m;
            }
        }
        return minMoves;

        /*
         * TLE solution
         * int count = 0;
         * Set<Integer> uniqueSet = new HashSet<>();
         * while (uniqueSet.size() != 1) {
         * for (int i : nums) {
         * uniqueSet.add(i);
         * }
         * int max = 0;
         * for (int i = 0; i < nums.length - 1; i++) {
         * if (nums[max] < nums[i]) {
         * max = i;
         * }
         * }
         * for (int i = 0; i < max; i++) {
         * nums[i] += 1;
         *
         * }
         * for (int i = max + 1; i < nums.length; i++) {
         * nums[i] += 1;
         *
         * }
         * count++;
         * }
         * return count;
         */
    }

}