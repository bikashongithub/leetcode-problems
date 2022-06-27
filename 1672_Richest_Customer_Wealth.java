class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = -1;
        int rowWealth;
        // for each row add the customer's wealth
        for (int[] row : accounts) {
            rowWealth = 0;
            for (int money : row) {
                rowWealth += money;
            }
            // compare with the max wealth and assign maxwealth if conditions met
            if (maxWealth < rowWealth)
                maxWealth = rowWealth;
        }
        return maxWealth;
    }
}