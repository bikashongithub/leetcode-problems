class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = -1;
        int rowWealth;
        for (int row = 0; row < accounts.length; row++) {
            rowWealth = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                rowWealth += accounts[row][col];
            }
            if (maxWealth < rowWealth)
                maxWealth = rowWealth;
        }
        return maxWealth;
    }
}