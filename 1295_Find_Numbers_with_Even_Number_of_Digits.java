class Solution {
    public int findNumbers(int[] nums) {
        int temp;
        int res = 0;
        // for every value at ith index check for the total number of digits present int
        // number
        for (int i = 0; i < nums.length; i++) {
            temp = 0;
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                temp++;
            }
            if (temp % 2 == 0)
                res++;

        }
        return res;

    }
}