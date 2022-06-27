class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        int temp = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude[i + 1] = temp + gain[i];
            temp = altitude[i + 1];
            if (temp > max) {
                max = temp;
            }
        }
        return max;

    }
}