class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        int m;

        if (target == letters[letters.length - 1])
            return letters[0];
        // simple binary search
        while (s <= e) {
            m = s + (e - s) / 2;
            if (letters[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }
        // since there is wrap around of array, thus modulo operation
        return letters[s % letters.length];
    }
}
