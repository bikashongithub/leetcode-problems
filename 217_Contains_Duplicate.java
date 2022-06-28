class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
                if (nums[j] == nums[j - 1])
                    return true;
            }
            if (!swapped)
                break;
        }
        return false;
    }
}