class Solution {
    public int minDeletions(String s) {
        // store the frequency of each alphabet in an array
        int[] frequencyArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequencyArray[s.charAt(i) - 'a']++;

        }

        // maintain a hash set to check for same no of frequency occurence
        Set<Integer> frequencySet = new HashSet<>();
        // total deletion count
        int count = 0;
        for (int i = 0; i < frequencyArray.length; i++) {
            while (frequencyArray[i] > 0) {
                // for same frequency of alphabet
                if (frequencySet.contains(frequencyArray[i])) {
                    count++;
                    frequencyArray[i]--;
                } else {
                    break;
                }

            }
            if (frequencyArray[i] != 0) {
                frequencySet.add(frequencyArray[i]);
            }
        }
        return count;

    }
}