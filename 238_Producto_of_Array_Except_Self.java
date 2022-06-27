class Solution {
    public int[] productExceptSelf(int[] nums) {
        // array to store the result
        int[] result = new int[nums.length];
        // initial product
        int tmp = 1;
        // TODO:
        for (int i = 0; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }
        return result;
    }

}