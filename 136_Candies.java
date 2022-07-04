public class Solution {
    public int candy(int[] ratings) {
        int candies = 0, n = ratings.length;

        // create arrays for both side traversing for checking the neighbours ratings
        // and increasing the candies
        int[] l2r = new int[n];
        int[] r2l = new int[n];

        Arrays.fill(l2r, 1);
        Arrays.fill(r2l, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                l2r[i] = l2r[i - 1] + 1;
            }
        }

        // traversing throungh right to left checking for the neigbours ratings
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                r2l[i] = r2l[i + 1] + 1;
        }

        // taking the max no of candies from the l2r and r2l array for the ith position
        // and adding it to the sum
        for (int i = 0; i < n; i++) {
            candies = candies + Math.max(l2r[i], r2l[i]);
        }

        return candies;
    }
}