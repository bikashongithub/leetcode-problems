class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List booleanArray = new ArrayList<>(candies.length);
        int maxitem = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= maxitem) {
                maxitem = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= maxitem) {
                booleanArray.add(true);
            } else {
                booleanArray.add(false);
            }
        }
        return booleanArray;
    }
}