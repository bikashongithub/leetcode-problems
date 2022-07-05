class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;

        // create a hashset and add all the elements of nums array into hash set
        HashSet<Integer> set = new HashSet<>();
        for (int item : nums) {
            set.add(item);
        }

        // iterate every items in nums array
        for (int item : nums) {

            // check if there is item smaller by just one than the current item present in
            // ..
            // hashset or not(basically checking the start point of the sequence)
            if (!set.contains(item - 1)) {
                int tl = 1;

                // if not present then keep increasing the tl(total length of ongoing sequence)
                while (set.contains(item + tl)) {
                    tl++;
                }

                // compare with previous maxLength of sequence
                if (maxLength < tl) {
                    maxLength = tl;

                }
            }
        }
        return maxLength;

    }
}